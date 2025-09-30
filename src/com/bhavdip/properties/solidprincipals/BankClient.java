package com.bhavdip.properties.solidprincipals;

import java.util.ArrayList;
import java.util.List;

public class BankClient {
    private List<WithdrawableAccount> withdrawableAccountList;
    private List<DepositeAccount> depositeAccountList;

    BankClient(List<WithdrawableAccount> withdrawableAccountList, List<DepositeAccount> depositeAccountList) {
        this.withdrawableAccountList = withdrawableAccountList;
        this.depositeAccountList = depositeAccountList;
    }

    public void transactions() {
        for (WithdrawableAccount withdrawableAccount :withdrawableAccountList) {
            withdrawableAccount.deposite(200);
            withdrawableAccount.withdraw(10);
            withdrawableAccount.withdraw(20);
        }

        for (DepositeAccount depositeAccount: depositeAccountList){
            depositeAccount.deposite(500);
        }
    }
}
