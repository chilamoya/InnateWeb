package com.innate.cresterp.accounting;

import com.innate.cresterp.accounting.util.MobilePageController;
import com.innate.cresterp.accounting.entities.Accounttransactiondefinition;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "accounttransactiondefinitionController")
@ViewScoped
public class AccounttransactiondefinitionController extends AbstractController<Accounttransactiondefinition> {

    @Inject
    private AccountprocesstransactionController accountprocesstransactionIdController;
    @Inject
    private AccountController creditaccountIdController;
    @Inject
    private AccountController debitaccountIdController;
    @Inject
    private MobilePageController mobilePageController;

    public AccounttransactiondefinitionController() {
        // Inform the Abstract parent controller of the concrete Accounttransactiondefinition Entity
        super(Accounttransactiondefinition.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        accountprocesstransactionIdController.setSelected(null);
        creditaccountIdController.setSelected(null);
        debitaccountIdController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Accountprocesstransaction controller
     * in order to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareAccountprocesstransactionId(ActionEvent event) {
        if (this.getSelected() != null && accountprocesstransactionIdController.getSelected() == null) {
            accountprocesstransactionIdController.setSelected(this.getSelected().getAccountprocesstransactionId());
        }
    }

    /**
     * Sets the "selected" attribute of the Account controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareCreditaccountId(ActionEvent event) {
        if (this.getSelected() != null && creditaccountIdController.getSelected() == null) {
            creditaccountIdController.setSelected(this.getSelected().getCreditaccountId());
        }
    }

    /**
     * Sets the "selected" attribute of the Account controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareDebitaccountId(ActionEvent event) {
        if (this.getSelected() != null && debitaccountIdController.getSelected() == null) {
            debitaccountIdController.setSelected(this.getSelected().getDebitaccountId());
        }
    }
}
