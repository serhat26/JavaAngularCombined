import { Routes } from "@angular/router";

import { GeneralLedger } from "./generalledger/generalledger.component";
export const ApplicationRoutes: Routes = [
  {
    path: "",
    children: [
      {
        path: "generalledger",
        component: GeneralLedger,
        children: [
          {
            path: "",
            loadChildren:
              "./generalledger/generalledger.module#GeneralLedgerModule",
          },
        ],
      },
    ],
  },
];
