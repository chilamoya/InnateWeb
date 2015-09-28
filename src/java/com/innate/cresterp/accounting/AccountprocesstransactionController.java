package com.innate.cresterp.accounting;

import com.innate.cresterp.accounting.util.MobilePageController;
import com.innate.cresterp.accounting.entities.Accountprocesstransaction;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "accountprocesstransactionController")
@ViewScoped
public class AccountprocesstransactionController extends AbstractController<Accountprocesstransaction> {

    @Inject
    private AccountingprocessdefinitionController accountprocessdefinitionIdController;
    @Inject
    private MobilePageController mobilePageController;

    public AccountprocesstransactionController() {
        // Inform the Abstract parent controller of the concrete Accountprocesstransaction Entity
        super(Accountprocesstransaction.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        accountprocessdefinitionIdController.setSelected(null);
    }

    /**
     * Sets the "items" attribute with a collection of
     * Accounttransactiondefinition entities that are retrieved from
     * Accountprocesstransaction?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Accounttransactiondefinition page
     */
    public String navigateAccounttransactiondefinitionList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Accounttransactiondefinition_items", this.getSelected().getAccounttransactiondefinitionList());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/accounttransactiondefinition/index";
    }

    /**
     * Sets the "items" attribute with a collection of Bookofaccounts entities
     * that are retrieved from Accountprocesstransaction?cap_first and returns
     * the navigation outcome.
     *
     * @return navigation outcome for Bookofaccounts page
     */
    public String navigateBookofaccountsList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Bookofaccounts_items", this.getSelected().getBookofaccountsList());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/bookofaccounts/index";
    }

    /**
     * Sets the "selected" attribute of the Accountingprocessdefinition
     * controller in order to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareAccountprocessdefinitionId(ActionEvent event) {
        if (this.getSelected() != null && accountprocessdefinitionIdController.getSelected() == null) {
            accountprocessdefinitionIdController.setSelected(this.getSelected().getAccountprocessdefinitionId());
        }
    }
}
