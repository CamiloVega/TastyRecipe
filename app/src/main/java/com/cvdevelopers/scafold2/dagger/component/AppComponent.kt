package com.cvdevelopers.scafold2.dagger.component

import com.cvdevelopers.scafold2.dagger.module.BindingModule
import com.cvdevelopers.scafold2.dagger.module.DataModule
import com.cvdevelopers.scafold2.dagger.module.NetworkModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, BindingModule::class, NetworkModule::class, DataModule::class])
interface AppComponent: AndroidInjector<DaggerApplication> {

    @Component.Factory
    abstract class Builder: AndroidInjector.Factory<DaggerApplication>

}