import { Routes } from '@angular/router';
import { LoginComponent } from './pages/login/login.component';
import { TelaVendaComponent } from './pages/tela-venda/tela-venda.component';
import { VendaComponent } from './pages/venda/venda.component';
import { EstoqueComponent } from './pages/estoque/estoque.component';
import { RelatoriosComponent } from './pages/relatorios/relatorios.component';
import { ContadorComponent } from './pages/contador/contador.component';
import { ConfigurarComponent } from './pages/configurar/configurar.component';
import { SuporteComponent } from './pages/suporte/suporte.component';
import { ListVendaComponent } from './components/list-venda/list-venda.component';
import { ListOrcamentoComponent } from './components/list-orcamento/list-orcamento.component';
import { NotFoundComponent } from './pages/not-found/not-found.component';

export const routes: Routes = [
  {path:"login",component:LoginComponent},
  {path:"",redirectTo:"v1",pathMatch:"full"},
  {
    path:"v1",
    component:TelaVendaComponent,
    children:[
      {path:"",redirectTo:"venda",pathMatch:"full"},
      {
        path:"venda",
        component:VendaComponent,
        children:[
          {path:"",redirectTo:"v",pathMatch:"full"},
          {path:"v",component:ListVendaComponent},
          {path:"o",component:ListOrcamentoComponent}
        ]
      },
      {path:"estoque",component:EstoqueComponent},
      {path:"relatorio",component:RelatoriosComponent},
      {path:"contador",component:ContadorComponent},
      {path:"configuracao",component:ConfigurarComponent},
      {path:"suporte",component:SuporteComponent}
    ]
  },
  {path:"**",component:NotFoundComponent},
];
