package com.innate.cresterp.accounting;

import com.innate.cresterp.accounting.util.MobilePageController;
import com.innate.cresterp.accounting.entities.Company;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "companyController")
@ViewScoped
public class CompanyController extends AbstractController<Company> {

    @Inject
    private MobilePageController mobilePageController;

    public CompanyController() {
        // Inform the Abstract parent controller of the concrete Company Entity
        super(Company.class);
    }

}
