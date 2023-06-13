package net.moewes.cloudui.example.vaadin;

import jakarta.annotation.PostConstruct;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.H1;
import net.moewes.cloudui.vaadin.Button;
import net.moewes.cloudui.vaadin.HorizontalLayout;
import net.moewes.cloudui.vaadin.VerticalLayout;
import net.moewes.cloudui.vaadin.input.Checkbox;
import net.moewes.cloudui.vaadin.input.TextField;

@CloudUiView("/quickstart")
public class QuickStart extends VerticalLayout {

    private VerticalLayout todosList;

    @PostConstruct
    public void init() {
        todosList = new VerticalLayout();
        TextField taskField = new TextField();
        Button addButton = new Button("Add");

        addButton.addClickListener(click -> {
            Checkbox checkbox = new Checkbox(taskField.getValue());
            todosList.add(checkbox);
        });
       // addButton.addClickShortcut(Key.ENTER);

        add(
                new H1("Vaadin Todo"),
                todosList,
                new HorizontalLayout(
                        taskField,
                        addButton
                )
        );
    }
}
