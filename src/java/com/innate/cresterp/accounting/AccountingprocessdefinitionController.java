package com.innate.cresterp.accounting;

import com.innate.cresterp.accounting.util.MobilePageController;
import com.innate.cresterp.accounting.entities.Accountingprocessdefinition;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "accountingprocessdefinitionController")
@ViewScoped
public class AccountingprocessdefinitionController extends AbstractController<Accountingprocessdefinition> {

    @Inject
    private MobilePageController mobilePageController;

    public AccountingprocessdefinitionController() {
        // Inform the Abstract parent controller of the concrete Accountingprocessdefinition Entity
        super(Accountingprocessdefinition.class);
    }

    /**
     * Sets the "items" attribute with a collection of Accountprocesstransaction
     * entities that are retrieved from Accountingprocessdefinition?cap_first
     * and returns the navigation outcome.
     *
     * @return navigation outcome for Accountprocesstransaction page
     */
    public String navigateAccountprocesstransactionList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Accountprocesstransaction_items", this.getSelected().getAccountprocesstransactionList());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/accountprocesstransaction/index";
    }

}
