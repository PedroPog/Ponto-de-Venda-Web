import { AfterViewInit, Component, ElementRef, Input, Renderer2, ViewChild } from '@angular/core';

@Component({
  selector: 'item-produto',
  standalone: true,
  imports: [],
  templateUrl: './item-produto.component.html',
  styleUrl: './item-produto.component.scss'
})
export class ItemProdutoComponent implements AfterViewInit{
  @Input()
  descricao = "Teste";
  @Input()
  color = "#fff";

  @ViewChild('color',{static:true})
  styleColor!: ElementRef;

  constructor(private renderer: Renderer2) {}

  ngAfterViewInit() {
    // Altera o estilo após a visualização ser inicializada
    this.renderer.setStyle(this.styleColor.nativeElement, 'background-color', this.color);
  }

}
