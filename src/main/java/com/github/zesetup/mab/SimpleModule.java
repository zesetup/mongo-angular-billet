package com.github.zesetup.mab;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.github.zesetup.mab.MongoProvider;
import com.github.zesetup.mab.MongoProviderImpl;
import com.github.zesetup.mab.service.EmployeeService;

public class SimpleModule implements Module {
    @Override
    public void configure(final Binder binder) {
      binder.bind(EmployeeService.class);
      binder.bind(MongoProvider.class).to(MongoProviderImpl.class);
    }

}