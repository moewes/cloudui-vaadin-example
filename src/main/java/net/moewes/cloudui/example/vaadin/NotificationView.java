package net.moewes.cloudui.example.vaadin;

import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.vaadin.Button;
import net.moewes.cloudui.vaadin.Notification;
import net.moewes.cloudui.vaadin.VerticalLayout;

import java.util.Arrays;

@CloudUiView("/vaadin/notification")
public class NotificationView extends VerticalLayout {

    public NotificationView() {

        getElement().setAttribute("style", "padding: 1em");

        Arrays.stream(Notification.Position.values()).forEach(this::addNotification);
    }

    private void addNotification(Notification.Position position) {

        String text = "Notification with position: " + position.name();
        Notification notification = new Notification(text, 2000, position);
        Button button = new Button(text, event -> notification.open());
        add(notification, button);
    }
}