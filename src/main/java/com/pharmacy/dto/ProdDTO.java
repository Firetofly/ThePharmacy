package com.pharmacy.dto;

import com.pharmacy.model.Provider;
import com.pharmacy.model.Sale;
import org.aspectj.apache.bcel.classfile.Module;

import java.util.List;

public class ProdDTO {

    private String displayName;

    private List<Sale> sales;

    private List<Provider> providers;
}
