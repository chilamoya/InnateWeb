package com.innate.cresterp.accounting;

import com.innate.cresterp.accounting.util.MobilePageController;
import com.innate.cresterp.accounting.entities.Bookofaccounts;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "bookofaccountsController")
@ViewScoped
public class BookofaccountsController extends AbstractController<Bookofaccounts> {

    @Inject
    private AccountController creditedaccountIdController;
    @Inject
    private AccountController debitedaccountIdController;
    @Inject
    private AccountprocesstransactionController transactionIdController;
    @Inject
    private SystemuserController userIdController;
    @Inject
    private MobilePageController mobilePageController;

    public BookofaccountsController() {
        // Inform the Abstract parent controller of the concrete Bookofaccounts Entity
        super(Bookofaccounts.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        creditedaccountIdController.setSelected(null);
        debitedaccountIdController.setSelected(null);
        transactionIdController.setSelected(null);
        userIdController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Account controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareCreditedaccountId(ActionEvent event) {
        if (this.getSelected() != null && creditedaccountIdController.getSelected() == null) {
            creditedaccountIdController.setSelected(this.getSelected().getCreditedaccountId());
        }
    }

    /**
     * Sets the "selected" attribute of the Account controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareDebitedaccountId(ActionEvent event) {
        if (this.getSelected() != null && debitedaccountIdController.getSelected() == null) {
            debitedaccountIdController.setSelected(this.getSelected().getDebitedaccountId());
        }
    }

    /**
     * Sets the "selected" attribute of the Accountprocesstransaction controller
     * in order to display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareTransactionId(ActionEvent event) {
        if (this.getSelected() != null && transactionIdController.getSelected() == null) {
            transactionIdController.setSelected(this.getSelected().getTransactionId());
        }
    }

    /**
     * Sets the "selected" attribute of the Systemuser controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareUserId(ActionEvent event) {
        if (this.getSelected() != null && userIdController.getSelected() == null) {
            userIdController.setSelected(this.getSelected().getUserId());
        }
    }
}
