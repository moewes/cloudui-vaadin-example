package net.moewes.cloudui.example.vaadin;

import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Label;
import net.moewes.cloudui.vaadin.FormLayout;
import net.moewes.cloudui.vaadin.VerticalLayout;
import net.moewes.cloudui.vaadin.input.TextField;

@CloudUiView("/vaadin/formLayout")
public class FormLayoutView extends VerticalLayout {

    public FormLayoutView() {

        getElement().setAttribute("style", "padding: 1em");

        FormLayout form = new FormLayout();

        form.addResponsiveStep("0", 1, FormLayout.LabelPosition.TOP);
        form.addResponsiveStep("30em", 1, FormLayout.LabelPosition.ASIDE);
        form.addResponsiveStep("40em", 2, FormLayout.LabelPosition.TOP);
        form.addResponsiveStep("50em", 2, FormLayout.LabelPosition.ASIDE);

        Label nameLabel = new Label("Name");
        TextField nameField = new TextField();
        form.addFormItem(nameField, nameLabel);
        Label titleLabel = new Label("Title");
        TextField titleField = new TextField();
        form.addFormItem(titleField, titleLabel);
        Label label = new Label("Very long label with some Words");
        TextField field = new TextField();
        form.addFormItem(field, label);

        add(form);

    }
}
