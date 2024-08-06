import { Injectable } from '@angular/core';
import { Remoto } from '../models/url.model';
import { HttpClient } from '@angular/common/http';
import { catchError, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CateProdService {
  private UrlRemoto = new Remoto();

  private listarProduto = this.UrlRemoto.host+'/buscar/produto/todos';
  private listarCategoria = this.UrlRemoto.host+'/buscar/categoria/todas';

  constructor(private httpClient: HttpClient) { }

  listarProdutoAll(nomeBanco:string):Observable<any>{
    return this.httpClient.post<any>(this.listarProduto,{
      nomeBanco:nomeBanco
    })
    .pipe(
      catchError((error) => {
        // Retorna o status do erro
        return (error.status+": "+error.error);
      })
    );
  }
  listarCategoriaAll(nomeBanco:string):Observable<any>{
    return this.httpClient.post<any>(this.listarCategoria,{
      nomeBanco:nomeBanco
    });
  }
}
