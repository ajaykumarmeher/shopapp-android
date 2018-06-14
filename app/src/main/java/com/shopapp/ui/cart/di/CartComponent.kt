package com.shopapp.ui.cart.di

import com.shopapp.ui.cart.CartActivity
import com.shopapp.ui.cart.CartWidget
import dagger.Subcomponent

@Subcomponent(modules = [CartModule::class])
interface CartComponent {

    fun inject(activity: CartActivity)

    fun inject(view: CartWidget)
}