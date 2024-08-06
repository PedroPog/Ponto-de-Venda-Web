import { Component, OnDestroy, OnInit } from '@angular/core';
import { ItemProdutoComponent } from "../itens/item-produto/item-produto.component";

@Component({
  selector: 'list-produto',
  standalone: true,
  imports: [ItemProdutoComponent],
  templateUrl: './list-produto.component.html',
  styleUrl: './list-produto.component.scss'
})
export class ListProdutoComponent implements OnInit,OnDestroy{
  date: Date = new Date();
  formattedDate: string = this.formatDate(this.date);
  versao = "V.07.24M";
  private intervalId: any; // Para armazenar o ID do intervalo

  ngOnInit(): void {
    // Atualiza o horário a cada segundo
    this.intervalId = setInterval(() => {
      this.date = new Date();
      this.formattedDate = this.formatDate(this.date);
    }, 1000);
  }

  ngOnDestroy(): void {
    // Limpa o intervalo quando o componente é destruído
    if (this.intervalId) {
      clearInterval(this.intervalId);
    }
  }

  private formatDate(date: Date): string {
    const day: string = String(date.getDate()).padStart(2, '0');
    const month: string = String(date.getMonth() + 1).padStart(2, '0'); // Mês começa do 0
    const year: number = date.getFullYear();

    const hours: string = String(date.getHours()).padStart(2, '0');
    const minutes: string = String(date.getMinutes()).padStart(2, '0');
    const seconds: string = String(date.getSeconds()).padStart(2, '0');

    return `${day}/${month}/${year} ${hours}:${minutes}:${seconds}`;
  }
}
