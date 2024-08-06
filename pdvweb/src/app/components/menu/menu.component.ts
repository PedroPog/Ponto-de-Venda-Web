import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'menu',
  standalone: true,
  imports: [
    CommonModule,
    RouterModule
  ],
  templateUrl: './menu.component.html',
  styleUrl: './menu.component.scss'
})
export class MenuComponent {
  menuItems = [
    { label: 'VENDER', icon: 'shopping_cart' },
    { label: 'CADASTROS', icon: 'edit' },
    { label: 'RELATORIOS', icon: 'trending_up' },
    { label: 'CONTADOR', icon: 'mail' },
    { label: 'CONFIGURAR', icon: 'settings' },
    { label: 'SUPORTE', icon: 'support_agent' },
    { label: 'SAIR', icon: 'meeting_room' },
  ];

  selectedItemIndex = 0; // Defina o índice do item selecionado inicialmente

  onSelectItem(index: number): void {
    this.selectedItemIndex = index; // Atualiza o item selecionado
  }
}
