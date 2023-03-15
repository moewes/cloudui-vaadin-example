package net.moewes.cloudui.example.vaadin;

import net.moewes.cloudui.UiComponent;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.html.H1;

@CloudUiView("/")
public class MainView extends Div {

    public MainView() {
        super();

        getElement().setAttribute("style", "padding: 1em");

        add(new H1("Vaadin Examples"));

        add(getLink("App Layout","/vaadin/appLayout"));
        add(getLink("Button","/vaadin/button"));
        add(getLink("Detail","/vaadin/details"));
        add(getLink("Form Layout","/vaadin/formLayout"));
        add(getLink("Notification","/vaadin/notification"));
        add(getLink("Tabs","/vaadin/tabs"));
        add(getLink("Text Fields",        "/vaadin/textField"));
    }

    private UiComponent getLink(String text, String url)  {
        Div div = new Div();
        UiComponent link = new UiComponent("a");
        link.setInnerHtml(text);
        link.getElement().setAttribute("href",url);
        div.add(link);
        return div;
    }
}
