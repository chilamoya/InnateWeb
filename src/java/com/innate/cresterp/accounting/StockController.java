package com.innate.cresterp.accounting;

import com.innate.cresterp.accounting.util.MobilePageController;
import com.innate.cresterp.accounting.entities.Stock;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "stockController")
@ViewScoped
public class StockController extends AbstractController<Stock> {

    @Inject
    private MobilePageController mobilePageController;

    public StockController() {
        // Inform the Abstract parent controller of the concrete Stock Entity
        super(Stock.class);
    }

}
