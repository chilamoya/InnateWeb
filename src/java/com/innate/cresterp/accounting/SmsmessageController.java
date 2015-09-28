package com.innate.cresterp.accounting;

import com.innate.cresterp.accounting.util.MobilePageController;
import com.innate.cresterp.accounting.entities.Smsmessage;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "smsmessageController")
@ViewScoped
public class SmsmessageController extends AbstractController<Smsmessage> {

    @Inject
    private MobilePageController mobilePageController;

    public SmsmessageController() {
        // Inform the Abstract parent controller of the concrete Smsmessage Entity
        super(Smsmessage.class);
    }

}
