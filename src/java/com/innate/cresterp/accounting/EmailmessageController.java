package com.innate.cresterp.accounting;

import com.innate.cresterp.accounting.util.MobilePageController;
import com.innate.cresterp.accounting.entities.Emailmessage;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "emailmessageController")
@ViewScoped
public class EmailmessageController extends AbstractController<Emailmessage> {

    @Inject
    private MobilePageController mobilePageController;

    public EmailmessageController() {
        // Inform the Abstract parent controller of the concrete Emailmessage Entity
        super(Emailmessage.class);
    }

}
