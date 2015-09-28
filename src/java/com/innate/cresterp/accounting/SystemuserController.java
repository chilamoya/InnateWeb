package com.innate.cresterp.accounting;

import com.innate.cresterp.accounting.util.MobilePageController;
import com.innate.cresterp.accounting.entities.Systemuser;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "systemuserController")
@ViewScoped
public class SystemuserController extends AbstractController<Systemuser> {

    @Inject
    private MobilePageController mobilePageController;

    public SystemuserController() {
        // Inform the Abstract parent controller of the concrete Systemuser Entity
        super(Systemuser.class);
    }

    /**
     * Sets the "items" attribute with a collection of Bookofaccounts entities
     * that are retrieved from Systemuser?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Bookofaccounts page
     */
    public String navigateBookofaccountsList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Bookofaccounts_items", this.getSelected().getBookofaccountsList());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/bookofaccounts/index";
    }

}
