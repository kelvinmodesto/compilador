/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.analysis;

import portugol.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAPrograma(APrograma node);
    void caseACabecalho(ACabecalho node);
    void caseADeclaracao(ADeclaracao node);
    void caseAVarDeclaracao(AVarDeclaracao node);
    void caseARealTipo(ARealTipo node);
    void caseAInteiroTipo(AInteiroTipo node);
    void caseACaractereTipo(ACaractereTipo node);
    void caseAUnicaVarLista(AUnicaVarLista node);
    void caseAListaVarLista(AListaVarLista node);
    void caseASimplesVar(ASimplesVar node);
    void caseAVetorVar(AVetorVar node);
    void caseAConstDeclaracao(AConstDeclaracao node);
    void caseAStringValor(AStringValor node);
    void caseAInteiroValor(AInteiroValor node);
    void caseARealValor(ARealValor node);
    void caseACorpo(ACorpo node);
    void caseAVazioComandoLista(AVazioComandoLista node);
    void caseAUnicoComandoLista(AUnicoComandoLista node);
    void caseAListaComandoLista(AListaComandoLista node);
    void caseAAtribuicaoComando(AAtribuicaoComando node);
    void caseALeiaComando(ALeiaComando node);
    void caseAEscrevaComando(AEscrevaComando node);
    void caseAUnicaExpressaoLista(AUnicaExpressaoLista node);
    void caseASequenciaExpressaoLista(ASequenciaExpressaoLista node);
    void caseATermoExpressao(ATermoExpressao node);
    void caseASomaExpressao(ASomaExpressao node);
    void caseASubExpressao(ASubExpressao node);
    void caseAFatorTermo(AFatorTermo node);
    void caseAMultTermo(AMultTermo node);
    void caseADivTermo(ADivTermo node);
    void caseAIdFator(AIdFator node);
    void caseAInteiroFator(AInteiroFator node);
    void caseARealFator(ARealFator node);
    void caseAParentesesFator(AParentesesFator node);

    void caseTId(TId node);
    void caseTBranco(TBranco node);
    void caseTCPrograma(TCPrograma node);
    void caseTCInicio(TCInicio node);
    void caseTCFim(TCFim node);
    void caseTCConst(TCConst node);
    void caseTCReal(TCReal node);
    void caseTCInteiro(TCInteiro node);
    void caseTCCaractere(TCCaractere node);
    void caseTCLeia(TCLeia node);
    void caseTCEscreva(TCEscreva node);
    void caseTCSe(TCSe node);
    void caseTCEntao(TCEntao node);
    void caseTCSenao(TCSenao node);
    void caseTCFimSe(TCFimSe node);
    void caseTCAvalie(TCAvalie node);
    void caseTCCaso(TCCaso node);
    void caseTCFimAvalie(TCFimAvalie node);
    void caseTCEnquanto(TCEnquanto node);
    void caseTCFaca(TCFaca node);
    void caseTCFimEnquanto(TCFimEnquanto node);
    void caseTCRepita(TCRepita node);
    void caseTCAte(TCAte node);
    void caseTCPara(TCPara node);
    void caseTCDe(TCDe node);
    void caseTCFimPara(TCFimPara node);
    void caseTCPasso(TCPasso node);
    void caseTInteiro(TInteiro node);
    void caseTString(TString node);
    void caseTReal(TReal node);
    void caseTSoma(TSoma node);
    void caseTSub(TSub node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTMenor(TMenor node);
    void caseTMaior(TMaior node);
    void caseTMenorIgual(TMenorIgual node);
    void caseTMaiorIgual(TMaiorIgual node);
    void caseTIgual(TIgual node);
    void caseTDif(TDif node);
    void caseTSeta(TSeta node);
    void caseTNao(TNao node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTXor(TXor node);
    void caseTPonto(TPonto node);
    void caseTVirgula(TVirgula node);
    void caseTDoisPontos(TDoisPontos node);
    void caseTPontoVirgula(TPontoVirgula node);
    void caseTAPar(TAPar node);
    void caseTFPar(TFPar node);
    void caseTACol(TACol node);
    void caseTFCol(TFCol node);
    void caseTACha(TACha node);
    void caseTFCha(TFCha node);
    void caseTComentarioLinha(TComentarioLinha node);
    void caseTComentarioAninhado(TComentarioAninhado node);
    void caseTFComentarioAninhado(TFComentarioAninhado node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
