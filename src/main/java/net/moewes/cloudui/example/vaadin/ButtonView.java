package net.moewes.cloudui.example.vaadin;

import jakarta.annotation.PostConstruct;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.html.Label;
import net.moewes.cloudui.vaadin.Button;
import net.moewes.cloudui.vaadin.HorizontalLayout;

import java.util.Arrays;

@CloudUiView("/vaadin/button")
public class ButtonView extends Div {

    @PostConstruct
    public void createView() {
        getElement().setAttribute("style", "padding: 1em");

        Arrays.stream(Button.Color.values()).forEach(color -> {

            add(new Label("Color: " + color.name()));
            HorizontalLayout buttonLayout = new HorizontalLayout();
            buttonLayout.getElement().setAttribute("theme", "spacing");
            add(buttonLayout);

            Arrays.stream(Button.Type.values()).forEach(type -> {
                Button button = new Button(type.name());
                buttonLayout.add(button);
                button.setType(type);
                button.setColor(color);
            });
        });
        Arrays.stream(Button.Size.values()).forEach(size -> {

            add(new Label("Size: " + size.name()));
            HorizontalLayout buttonLayout = new HorizontalLayout();
            buttonLayout.getElement().setAttribute("theme", "spacing");
            add(buttonLayout);

            Arrays.stream(Button.Type.values()).forEach(type -> {
                Button button = new Button(type.name());
                buttonLayout.add(button);
                button.setType(type);
                button.setSize(size);
            });
        });
    }

}
