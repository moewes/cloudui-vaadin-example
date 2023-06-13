package net.moewes.cloudui.example.vaadin;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.quarkus.runtime.CloudUi;
import net.moewes.cloudui.vaadin.Button;

@CloudUiView("/UiTest")
public class UiTestView extends Div {

    @Inject
    private CloudUi ui;

    @PostConstruct
    public void initView() {

        ui.setTitle("My Title");

        Button titleButton = new Button("Change Title");

        add(titleButton);

        titleButton.addEventListener("click", uiEvent -> ui.setTitle("Title changed"));

        Button alertButton = new Button("Alert");

        add(alertButton);

        alertButton.addEventListener("click", uiEvent -> ui.alert("My Message"));

        Button homeButton = new Button("Home Title internal");

        add(homeButton);

        homeButton.addEventListener("click", uiEvent -> {
            ui.navigate(MainView.class);
            ui.setTitle("Home internal");
            ui.changeUrl("/");
        });
        Button homeButton2 = new Button("Home external");

        add(homeButton2);
        homeButton2.addEventListener("click", uiEvent -> {
            ui.open("/","myTab");
            ui.setTitle("Home external");
        });
    }
}
