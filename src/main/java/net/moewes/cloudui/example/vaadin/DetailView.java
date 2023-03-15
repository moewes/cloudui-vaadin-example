package net.moewes.cloudui.example.vaadin;

import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.vaadin.Details;

import java.util.Arrays;

@CloudUiView("/vaadin/details")
public class DetailView extends Div {

    public DetailView() {

        getElement().setAttribute("style", "padding: 1em");

        Arrays.stream(Details.Themes.values()).forEach(theme -> {
            Details detail = new Details(theme.name());
            detail.setTheme(theme);
            add(detail);
        });
    }
}
