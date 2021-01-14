import { NgModule } from "@angular/core";
import { RouterModule } from "@angular/router";
import { CommonModule } from "@angular/common";
import { FormsModule } from "@angular/forms";
import { GeneralLedgerRoutes } from "./generalledger.routing";
import { GeneralLedger } from "./generalledger.component";
import { BrowserModule } from "@angular/platform-browser";
import { VoucherDefinition } from "./components/voucherdefinition/voucherdefinition.component";
import { VoucherComponent } from "./components/voucher/voucher.component";
import { PeriodComponent } from "./components/period/period.component";
import { JournalVoucher } from "./components/journalvoucher/journalvoucher.component";
import { DebitNote } from "./components/debitnote/debitnote.component";
import { ExpandMenu } from "./generalledger.directive";
import { BankRecipt } from "./components/banktransaction/bankreceipt/bankrecipt.component";
import { CashApproval } from "./components/cash/cashapproval/cashapproval.component";
import { CashPaymentApproval } from "./components/cash/cashpaymentapproval/cashpaymentapproval.component";
import { CashRecieptApproval } from "./components/cash/cashreceiptapproval/cashreceiptapproval.component";
import { CashPaymentVoucher } from "./components/cash/cashpaymentvoucher/cashpaymentvoucher.component";
import { BankReceiptApproval } from "./components/banktransaction/bankreceiptapproval/bankreceiptapproval.component";
import { BankPayment } from "./components/banktransaction/bankpayment/bankpayment.component";
import { PDCReceivables } from "./components/pdccomponent/pdcreceivables/pdcreceivables.component";
import { PDCReceivableDeposit } from "./components/pdccomponent/pdcreceivabledeposit/pdcreceivabledeposit.component";
import { PDCPayable } from "./components/pdccomponent/pdcpayable/pdcpayable.component";
import { PDCPayableChequeCancel } from "./components/pdccomponent/pdcpayablechequecancellation/pdcpayablechequecancellation.component";

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forChild(GeneralLedgerRoutes),
    FormsModule,
  ],
  declarations: [
    GeneralLedger,
    VoucherDefinition,
    VoucherComponent,
    PeriodComponent,
    JournalVoucher,
    DebitNote,
    ExpandMenu,
    BankRecipt,
    CashApproval,
    CashPaymentApproval,
    CashRecieptApproval,
    CashPaymentVoucher,
    BankReceiptApproval,
    BankPayment,
    PDCReceivables,
    PDCReceivableDeposit,
    PDCPayable,
    PDCPayableChequeCancel,
  ],
})
export class GeneralLedgerModule {}
