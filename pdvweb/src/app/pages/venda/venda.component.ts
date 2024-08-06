import { Component } from '@angular/core';
import { RouterModule, RouterOutlet } from '@angular/router';
import { ListProdutoComponent } from '../../components/list-produto/list-produto.component';

@Component({
  selector: 'app-venda',
  standalone: true,
  imports: [
    RouterOutlet,
    RouterModule,
    ListProdutoComponent
  ],
  templateUrl: './venda.component.html',
  styleUrl: './venda.component.scss'
})
export class VendaComponent {

}
