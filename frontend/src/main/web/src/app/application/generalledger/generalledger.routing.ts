import { Routes } from "@angular/router";
import { ChartOfAccounts } from "./components/chartofaccounts/chartofaccounts.component";
import { CurrencyMaster } from "./components/currencymaster/currencymaster.component";
import { CostCentre } from "./components/costcentre/costcentre.component";
import { GeneralLed } from "./components/generalled/generalled.component";
import { ControlAccounts } from "./components/controlaccounts/controlaccounts.component";
import { BankMaster } from "./components/bankmaster/bankmaster.component";
import { ChequeDetails } from "./components/chequedetails/chequedetails.component";
import { VoucherComponent } from "./components/voucher/voucher.component";
import { PeriodComponent } from "./components/period/period.component";
import { OtherSubledger } from "./components/othersubledger/othersubledger.component";
import { ArapMaster } from "./components/arapmaster/arapmaster.component";
import { UtilityMaster } from "./components/utilitymaster/utilitymaster.component";
import { BudgetEntry } from "./components/budgetentry/budgetentry.component";
import { JournalVoucher } from "./components/journalvoucher/journalvoucher.component";
import { VoucherDefinition } from "./components/voucherdefinition/voucherdefinition.component";
import { JournalVoucherApp } from "./components/journalvoucherapp/journalvoucherapp.component";
import { DebitNote } from "./components/debitnote/debitnote.component";
import { BankRecipt } from "./components/banktransaction/bankreceipt/bankrecipt.component";
import { CashApproval } from "./components/cash/cashapproval/cashapproval.component";
import { CashPaymentApproval } from "./components/cash/cashpaymentapproval/cashpaymentapproval.component";
import { CashRecieptApproval } from "./components/cash/cashreceiptapproval/cashreceiptapproval.component";
import { CashPaymentVoucher } from "./components/cash/cashpaymentvoucher/cashpaymentvoucher.component";
import { BankReceiptApproval } from "./components/banktransaction/bankreceiptapproval/bankreceiptapproval.component";
import { BankPayment } from "./components/banktransaction/bankpayment/bankpayment.component";
import { PDCReceivables } from "./components/pdccomponent/pdcreceivables/pdcreceivables.component";
import { CheckCancellation } from "./components/pdccomponent/checkcancellation/checkcancellation.component";
import { PDCReceivableDeposit } from "./components/pdccomponent/pdcreceivabledeposit/pdcreceivabledeposit.component";
import { Checqureturn } from "./components/pdccomponent/checquereturn/checquereturn.component";
import { PDCPayable } from "./components/pdccomponent/pdcpayable/pdcpayable.component";
import { PDCPayableChequeCancel } from "./components/pdccomponent/pdcpayablechequecancellation/pdcpayablechequecancellation.component";
export const GeneralLedgerRoutes: Routes = [
  {
    path: "",
    children: [
      {
        path: "chartsofaccounts",
        component: ChartOfAccounts,
      },
      {
        path: "currencymaster",
        component: CurrencyMaster,
      },
      {
        path: "costcentre",
        component: CostCentre,
      },
      {
        path: "generalledger",
        component: GeneralLed,
      },
      {
        path: "controlaccounts",
        component: ControlAccounts,
      },
      {
        path: "bankmaster",
        component: BankMaster,
      },
      {
        path: "chequedetails",
        component: ChequeDetails,
      },
      {
        path: "othersubledger",
        component: OtherSubledger,
      },
      {
        path: "arapmaster",
        component: ArapMaster,
      },
      {
        path: "utility",
        component: UtilityMaster,
      },
      {
        path: "budgetentry",
        component: BudgetEntry,
      },
      {
        path: "journalvoucher",
        component: JournalVoucher,
      },
      {
        path: "voucherdefinition",
        component: VoucherDefinition,
      },
      {
        path: "journalvoucherapp",
        component: JournalVoucherApp,
      },
      {
        path: "debitnote",
        component: DebitNote,
      },
      {
        path: "bankreceipt",
        component: BankRecipt,
      },
      {
        path: "cashapproval",
        component: CashApproval,
      },
      {
        path: "cashapprovalpayments",
        component: CashPaymentApproval,
      },
      {
        path: "cashreceiptapproval",
        component: CashRecieptApproval,
      },
      {
        path: "cashpaymentvoucher",
        component: CashPaymentVoucher,
      },
      {
        path: "bankreceiptapproval",
        component: BankReceiptApproval,
      },
      {
        path: "bankpayment",
        component: BankPayment,
      },
      {
        path: "pdcreivables",
        component: PDCReceivables,
      },
      {
        path: "checkcancellation",
        component: CheckCancellation,
      },
      {
        path: "pdcreceivabledeposit",
        component: PDCReceivableDeposit,
      },
      {
        path: "chequreturn",
        component: Checqureturn,
      },
      {
        path: "pdcpayable",
        component: PDCPayable,
      },
      {
        path: "pdcpayablechequecancel",
        component: PDCPayableChequeCancel,
      },
    ],
  },
];
