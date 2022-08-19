package com.herokuapp;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAngDrop {

    @Test
    void movingASquare (){
        open("https://the-internet.herokuapp.com/drag_and_drop");

        //actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(X, Y).release().perform(); - я не поняла,
        //как вычислить координаты квадрата B

        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-b").shouldHave(text("A"));
        $("#column-a").shouldHave(text("B"));


        sleep(2000);

    }
}
