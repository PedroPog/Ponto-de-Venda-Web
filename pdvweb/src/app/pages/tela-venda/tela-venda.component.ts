import { Component } from '@angular/core';
import { MenuComponent } from '../../components/menu/menu.component';
import { RouterModule, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-tela-venda',
  standalone: true,
  imports: [
    MenuComponent,
    RouterOutlet,
    RouterModule
  ],
  templateUrl: './tela-venda.component.html',
  styleUrl: './tela-venda.component.scss'
})
export class TelaVendaComponent {

}
