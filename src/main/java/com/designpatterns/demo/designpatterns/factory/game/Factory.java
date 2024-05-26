package com.designpatterns.demo.designpatterns.factory.game;

public class Factory {

    public static Game gameFactory(Platforms platforms){
        Game game = null;
        switch (platforms)
        {
            case COMPUTER:
                game = new PC();
                break;
            case PLAYSTATION:
                game = new PS();
                break;
        }
        return game;
    }
}
