package com.bakkenbaeck.token.network.rest.model;


public class SignedTransactionRequest {

    private final String type = "transaction_send";
    private final SignedWithdrawalInternals payload;

    public SignedTransactionRequest(final String transaction, final String signature) {
        this.payload = new SignedWithdrawalInternals(transaction, signature);
    }

    private static class SignedWithdrawalInternals {
        private String transaction;
        private String signature;
        private SignedWithdrawalInternals(final String transaction, final String signature) {
            this.transaction = transaction;
            this.signature = signature;
        }
    }
}