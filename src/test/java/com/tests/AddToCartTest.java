package com.tests;

import com.screens.ProductsListingScreen;
import com.tests.base.TestSetup;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.page;

class AddToCartTest extends TestSetup {

  private ProductsListingScreen productsListingScreen;
//this is first commit
  @Test
  void testSauceLabsApp() {
    productsListingScreen = page(ProductsListingScreen.class);

    productsListingScreen
        .selectBikeLightProduct()
        .checkWhetherAddToCartButtonPresent();
  }
}