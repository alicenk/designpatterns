package com.designpatterns.demo.controller;

import com.designpatterns.demo.designpatterns.builder.EmployeeConcreteBuilder;
import com.designpatterns.demo.designpatterns.builder.ManagerConcreteBuilder;
import com.designpatterns.demo.designpatterns.builder.PromotionBuilder;
import com.designpatterns.demo.designpatterns.builder.SendPromotion;
import com.designpatterns.demo.designpatterns.facade.RestaurantFacade;
import com.designpatterns.demo.designpatterns.factory.game.Factory;
import com.designpatterns.demo.designpatterns.factory.game.Game;
import com.designpatterns.demo.designpatterns.factory.game.Platforms;
import com.designpatterns.demo.designpatterns.factory.mobile.AbstractButton;
import com.designpatterns.demo.designpatterns.factory.mobile.ButtonFactory;
import com.designpatterns.demo.designpatterns.observer.ComputerDevice;
import com.designpatterns.demo.designpatterns.observer.MobileDevice;
import com.designpatterns.demo.designpatterns.observer.Observer;
import com.designpatterns.demo.designpatterns.observer.WeatherStation;
import com.designpatterns.demo.designpatterns.singleton.*;
import com.designpatterns.demo.designpatterns.strategy.car.OrderProduction;
import com.designpatterns.demo.designpatterns.strategy.car.Production;
import com.designpatterns.demo.designpatterns.strategy.car.SerialProduction;
import com.designpatterns.demo.designpatterns.strategy.car.SpecialProduction;
import com.designpatterns.demo.designpatterns.strategy.payment.BankTransferPayment;
import com.designpatterns.demo.designpatterns.strategy.payment.CreditCardPayment;
import com.designpatterns.demo.designpatterns.strategy.payment.PaymentContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/designpatterns")
public class DesignPatternController {
    @GetMapping("/eager-singleton")
    public ResponseEntity<Void> singleton(){
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();

        log.info("eagerSingleton1 => {}", eagerSingleton1);
        log.info("eagerSingleton2 => {}", eagerSingleton2);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/game/factory")
    public ResponseEntity<Void> gamneFactory(){
        Game pcGame = Factory.gameFactory(Platforms.COMPUTER);
        Game psGame = Factory.gameFactory(Platforms.PLAYSTATION);

        pcGame.platform();
        psGame.platform();

        return ResponseEntity.ok().build();
    }

    @GetMapping("/mobile/factory")
    public ResponseEntity<Void> mobileFactory(){
        AbstractButton iosButton = ButtonFactory.createButton("ios");
        iosButton.render();
        iosButton.onClick();

        AbstractButton androidButton = ButtonFactory.createButton("android");
        androidButton.render();
        androidButton.onClick();
        return ResponseEntity.ok().build();
    }

    @GetMapping("/car/strategy")
    public ResponseEntity<Void> carStrategy() {
        //Hangi class'ı verirsek onun instance'ına göre ilgili class'ın produce'unu çalıştırır
        new Production(new SpecialProduction());
        new Production(new SerialProduction());
        new Production(new OrderProduction());

        return ResponseEntity.ok().build();
    }

    @GetMapping("/payment/strategy")
    public ResponseEntity<Void> paymentStrategy() {
        PaymentContext context = new PaymentContext();

        // Kredi kartı ile ödeme yapılacak.
        context.setPaymentStrategy(new CreditCardPayment("Ali Cenk", "1234 5678 9012 3456", "123", "10/25"));
        context.pay(100.0);

        // Banka transferi ile ödeme yapılacak.
        context.setPaymentStrategy(new BankTransferPayment("TR0000123456789012345678", "Halk Bankası"));
        context.pay(50.0);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/facade")
    public ResponseEntity<Void> facade(){
        RestaurantFacade restaurant = new RestaurantFacade();
        restaurant.serveFood();
        return ResponseEntity.ok().build();
    }

    @GetMapping("/observer")
    public ResponseEntity<Void> observer() {
        WeatherStation weatherStation = new WeatherStation();
        Observer mobileDevice = new MobileDevice();
        Observer computer = new ComputerDevice();

        weatherStation.registerObserver(mobileDevice);
        weatherStation.registerObserver(computer);

        weatherStation.setTemperature(25);

        weatherStation.removeObserver(mobileDevice);

        weatherStation.setTemperature(30);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/builder")
    public ResponseEntity<Void> builder(){
        PromotionBuilder promotion = new EmployeeConcreteBuilder();
        SendPromotion sendPromotion = new SendPromotion();
        sendPromotion.send(promotion);
        log.info(promotion.promotion().toString());

        promotion = new ManagerConcreteBuilder();
        sendPromotion.send(promotion);
        log.info(promotion.promotion().toString());

        return ResponseEntity.ok().build();
    }
}
