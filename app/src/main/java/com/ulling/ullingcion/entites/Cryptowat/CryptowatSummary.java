package com.ulling.ullingcion.entites.Cryptowat;

import com.ulling.lib.core.entities.QcBaseItem;

public class CryptowatSummary extends QcBaseItem {
    private SummaryResult result = null;

    private Allowance allowance;

    public SummaryResult getResult() {
        return result;
    }

    public void setResult(SummaryResult result) {
        this.result = result;
    }

    public Allowance getAllowance() {
        return allowance;
    }

    public void setAllowance(Allowance allowance) {
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return "\nCryptowatSummary\n" +
                "result\n" + result ;
    }
}
