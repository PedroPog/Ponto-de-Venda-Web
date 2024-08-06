export interface Categoria {
  idcategoria: number;
  dthrcriacao: string;
  descricao: string;
  padrao: string;
  idncm: number;
  sinctributacao: string;
  origem: string;
  csosn: string;
  aliqicms: number;
  cstpis: string;
  aliqpis: number;
  cstcofins: string;
  aliqcofins: number;
  codcontribsocial:string;
  cor: string;
  cest: number;
  cfop: string;
}
export interface Produto {
  idproduto: number;
  dthrcriacao: string;
  descricao: string;
  idcategoria: number;
  preco: number;
  codigoean: null;
  precovariavel: string;
  favorito: string;
  sinctributacao: string;
  idncm: number;
  origem: string;
  csosn: string;
  aliqicms: number;
  cstpis: string;
  aliqpis: number;
  cstcofins: string;
  aliqcofins: number;
  codcontribsocial: string;
  cest: number;
  cfop: string;
  status: string;
  idunidade: number;
  nomeBanco: string;
  quantestoque: number;
}
