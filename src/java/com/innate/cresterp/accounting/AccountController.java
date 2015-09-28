package com.innate.cresterp.accounting;

import com.innate.cresterp.accounting.util.MobilePageController;
import com.innate.cresterp.accounting.entities.Account;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "accountController")
@ViewScoped
public class AccountController extends AbstractController<Account> {

    @Inject
    private MobilePageController mobilePageController;

    public AccountController() {
        // Inform the Abstract parent controller of the concrete Account Entity
        super(Account.class);
    }

    /**
     * Sets the "items" attribute with a collection of
     * Accounttransactiondefinition entities that are retrieved from
     * Account?cap_first and returns the navigation outcome.
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
     * Sets the "items" attribute with a collection of
     * Accounttransactiondefinition entities that are retrieved from
     * Account?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Accounttransactiondefinition page
     */
    public String navigateAccounttransactiondefinitionList1() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Accounttransactiondefinition_items", this.getSelected().getAccounttransactiondefinitionList1());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/accounttransactiondefinition/index";
    }

    /**
     * Sets the "items" attribute with a collection of Bookofaccounts entities
     * that are retrieved from Account?cap_first and returns the navigation
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

    /**
     * Sets the "items" attribute with a collection of Bookofaccounts entities
     * that are retrieved from Account?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Bookofaccounts page
     */
    public String navigateBookofaccountsList1() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Bookofaccounts_items", this.getSelected().getBookofaccountsList1());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/bookofaccounts/index";
    }

}
