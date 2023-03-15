package net.moewes.cloudui.example.vaadin;

import net.moewes.cloudui.UiComponent;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.vaadin.Tab;
import net.moewes.cloudui.vaadin.Tabs;
import net.moewes.cloudui.vaadin.VerticalLayout;

@CloudUiView("/vaadin/tabs")
public class TabsView extends VerticalLayout {

    public TabsView() {

        getElement().setAttribute("style", "padding: 1em");

        Tab tabOne = new Tab();
        tabOne.setInnerHtml("One");
        tabOne.addEventListener("click", e -> {
            UiComponent contentOne = new UiComponent("vaadin-item"); // TODO
            contentOne.setInnerHtml("<p>Content Tab One</p>");
            add(contentOne);
        });

        Tab tabTwo = new Tab();
        tabTwo.setInnerHtml("Two");
        tabTwo.addEventListener("click", e -> {
            UiComponent contentTwo = new UiComponent("vaadin-item"); // TODO
            contentTwo.setInnerHtml("<p>Content Tab Two</p>");
            add(contentTwo);
        });

        Tabs tabs = new Tabs();
        tabs.add(tabOne, tabTwo);
        add(tabs);
    }
}
