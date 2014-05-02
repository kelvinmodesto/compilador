/* This file was generated by SableCC (http://www.sablecc.org/). */

package src.portugol.analysis;

import java.util.*;
import src.portugol.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPPrograma().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAPrograma(APrograma node)
    {
        defaultIn(node);
    }

    public void outAPrograma(APrograma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrograma(APrograma node)
    {
        inAPrograma(node);
        if(node.getCabecalho() != null)
        {
            node.getCabecalho().apply(this);
        }
        if(node.getDeclaracao() != null)
        {
            node.getDeclaracao().apply(this);
        }
        if(node.getCorpo() != null)
        {
            node.getCorpo().apply(this);
        }
        if(node.getCFim() != null)
        {
            node.getCFim().apply(this);
        }
        if(node.getPonto() != null)
        {
            node.getPonto().apply(this);
        }
        outAPrograma(node);
    }

    public void inACabecalho(ACabecalho node)
    {
        defaultIn(node);
    }

    public void outACabecalho(ACabecalho node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACabecalho(ACabecalho node)
    {
        inACabecalho(node);
        if(node.getCPrograma() != null)
        {
            node.getCPrograma().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getCInicio() != null)
        {
            node.getCInicio().apply(this);
        }
        outACabecalho(node);
    }

    public void inADeclaracao(ADeclaracao node)
    {
        defaultIn(node);
    }

    public void outADeclaracao(ADeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclaracao(ADeclaracao node)
    {
        inADeclaracao(node);
        if(node.getVarDeclaracaoLista() != null)
        {
            node.getVarDeclaracaoLista().apply(this);
        }
        if(node.getConstDeclaracaoLista() != null)
        {
            node.getConstDeclaracaoLista().apply(this);
        }
        outADeclaracao(node);
    }

    public void inAVvazioVarDeclaracaoLista(AVvazioVarDeclaracaoLista node)
    {
        defaultIn(node);
    }

    public void outAVvazioVarDeclaracaoLista(AVvazioVarDeclaracaoLista node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVvazioVarDeclaracaoLista(AVvazioVarDeclaracaoLista node)
    {
        inAVvazioVarDeclaracaoLista(node);
        outAVvazioVarDeclaracaoLista(node);
    }

    public void inAVunicaVarDeclaracaoLista(AVunicaVarDeclaracaoLista node)
    {
        defaultIn(node);
    }

    public void outAVunicaVarDeclaracaoLista(AVunicaVarDeclaracaoLista node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVunicaVarDeclaracaoLista(AVunicaVarDeclaracaoLista node)
    {
        inAVunicaVarDeclaracaoLista(node);
        if(node.getVarDeclaracao() != null)
        {
            node.getVarDeclaracao().apply(this);
        }
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        outAVunicaVarDeclaracaoLista(node);
    }

    public void inAVlistaVarDeclaracaoLista(AVlistaVarDeclaracaoLista node)
    {
        defaultIn(node);
    }

    public void outAVlistaVarDeclaracaoLista(AVlistaVarDeclaracaoLista node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVlistaVarDeclaracaoLista(AVlistaVarDeclaracaoLista node)
    {
        inAVlistaVarDeclaracaoLista(node);
        if(node.getVarDeclaracaoLista() != null)
        {
            node.getVarDeclaracaoLista().apply(this);
        }
        if(node.getSeparacao() != null)
        {
            node.getSeparacao().apply(this);
        }
        if(node.getVarDeclaracao() != null)
        {
            node.getVarDeclaracao().apply(this);
        }
        if(node.getFinal() != null)
        {
            node.getFinal().apply(this);
        }
        outAVlistaVarDeclaracaoLista(node);
    }

    public void inAVarDeclaracao(AVarDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAVarDeclaracao(AVarDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarDeclaracao(AVarDeclaracao node)
    {
        inAVarDeclaracao(node);
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        if(node.getDoisPontos() != null)
        {
            node.getDoisPontos().apply(this);
        }
        if(node.getVarLista() != null)
        {
            node.getVarLista().apply(this);
        }
        outAVarDeclaracao(node);
    }

    public void inARealTipo(ARealTipo node)
    {
        defaultIn(node);
    }

    public void outARealTipo(ARealTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealTipo(ARealTipo node)
    {
        inARealTipo(node);
        if(node.getCReal() != null)
        {
            node.getCReal().apply(this);
        }
        outARealTipo(node);
    }

    public void inAInteiroTipo(AInteiroTipo node)
    {
        defaultIn(node);
    }

    public void outAInteiroTipo(AInteiroTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInteiroTipo(AInteiroTipo node)
    {
        inAInteiroTipo(node);
        if(node.getCInteiro() != null)
        {
            node.getCInteiro().apply(this);
        }
        outAInteiroTipo(node);
    }

    public void inACaractereTipo(ACaractereTipo node)
    {
        defaultIn(node);
    }

    public void outACaractereTipo(ACaractereTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACaractereTipo(ACaractereTipo node)
    {
        inACaractereTipo(node);
        if(node.getCCaractere() != null)
        {
            node.getCCaractere().apply(this);
        }
        outACaractereTipo(node);
    }

    public void inAUnicaVarLista(AUnicaVarLista node)
    {
        defaultIn(node);
    }

    public void outAUnicaVarLista(AUnicaVarLista node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUnicaVarLista(AUnicaVarLista node)
    {
        inAUnicaVarLista(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAUnicaVarLista(node);
    }

    public void inAListaVarLista(AListaVarLista node)
    {
        defaultIn(node);
    }

    public void outAListaVarLista(AListaVarLista node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListaVarLista(AListaVarLista node)
    {
        inAListaVarLista(node);
        if(node.getVarLista() != null)
        {
            node.getVarLista().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAListaVarLista(node);
    }

    public void inASimplesVar(ASimplesVar node)
    {
        defaultIn(node);
    }

    public void outASimplesVar(ASimplesVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimplesVar(ASimplesVar node)
    {
        inASimplesVar(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outASimplesVar(node);
    }

    public void inAVetorVar(AVetorVar node)
    {
        defaultIn(node);
    }

    public void outAVetorVar(AVetorVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVetorVar(AVetorVar node)
    {
        inAVetorVar(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getACol() != null)
        {
            node.getACol().apply(this);
        }
        if(node.getInteiro() != null)
        {
            node.getInteiro().apply(this);
        }
        if(node.getFCol() != null)
        {
            node.getFCol().apply(this);
        }
        outAVetorVar(node);
    }

    public void inAVazioConstDeclaracaoLista(AVazioConstDeclaracaoLista node)
    {
        defaultIn(node);
    }

    public void outAVazioConstDeclaracaoLista(AVazioConstDeclaracaoLista node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVazioConstDeclaracaoLista(AVazioConstDeclaracaoLista node)
    {
        inAVazioConstDeclaracaoLista(node);
        outAVazioConstDeclaracaoLista(node);
    }

    public void inAUnicaConstDeclaracaoLista(AUnicaConstDeclaracaoLista node)
    {
        defaultIn(node);
    }

    public void outAUnicaConstDeclaracaoLista(AUnicaConstDeclaracaoLista node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUnicaConstDeclaracaoLista(AUnicaConstDeclaracaoLista node)
    {
        inAUnicaConstDeclaracaoLista(node);
        if(node.getConstDeclaracao() != null)
        {
            node.getConstDeclaracao().apply(this);
        }
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        outAUnicaConstDeclaracaoLista(node);
    }

    public void inAListaConstDeclaracaoLista(AListaConstDeclaracaoLista node)
    {
        defaultIn(node);
    }

    public void outAListaConstDeclaracaoLista(AListaConstDeclaracaoLista node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListaConstDeclaracaoLista(AListaConstDeclaracaoLista node)
    {
        inAListaConstDeclaracaoLista(node);
        if(node.getConstDeclaracaoLista() != null)
        {
            node.getConstDeclaracaoLista().apply(this);
        }
        if(node.getSeparacao() != null)
        {
            node.getSeparacao().apply(this);
        }
        if(node.getConstDeclaracao() != null)
        {
            node.getConstDeclaracao().apply(this);
        }
        if(node.getFinal() != null)
        {
            node.getFinal().apply(this);
        }
        outAListaConstDeclaracaoLista(node);
    }

    public void inAConstDeclaracao(AConstDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAConstDeclaracao(AConstDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConstDeclaracao(AConstDeclaracao node)
    {
        inAConstDeclaracao(node);
        if(node.getCConst() != null)
        {
            node.getCConst().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAConstDeclaracao(node);
    }

    public void inAStringValor(AStringValor node)
    {
        defaultIn(node);
    }

    public void outAStringValor(AStringValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringValor(AStringValor node)
    {
        inAStringValor(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringValor(node);
    }

    public void inAInteiroValor(AInteiroValor node)
    {
        defaultIn(node);
    }

    public void outAInteiroValor(AInteiroValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInteiroValor(AInteiroValor node)
    {
        inAInteiroValor(node);
        if(node.getInteiro() != null)
        {
            node.getInteiro().apply(this);
        }
        outAInteiroValor(node);
    }

    public void inARealValor(ARealValor node)
    {
        defaultIn(node);
    }

    public void outARealValor(ARealValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealValor(ARealValor node)
    {
        inARealValor(node);
        if(node.getReal() != null)
        {
            node.getReal().apply(this);
        }
        outARealValor(node);
    }

    public void inACorpo(ACorpo node)
    {
        defaultIn(node);
    }

    public void outACorpo(ACorpo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACorpo(ACorpo node)
    {
        inACorpo(node);
        if(node.getComandoLista() != null)
        {
            node.getComandoLista().apply(this);
        }
        outACorpo(node);
    }

    public void inAVazioComandoLista(AVazioComandoLista node)
    {
        defaultIn(node);
    }

    public void outAVazioComandoLista(AVazioComandoLista node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVazioComandoLista(AVazioComandoLista node)
    {
        inAVazioComandoLista(node);
        outAVazioComandoLista(node);
    }

    public void inAUnicoComandoLista(AUnicoComandoLista node)
    {
        defaultIn(node);
    }

    public void outAUnicoComandoLista(AUnicoComandoLista node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUnicoComandoLista(AUnicoComandoLista node)
    {
        inAUnicoComandoLista(node);
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        outAUnicoComandoLista(node);
    }

    public void inAListaComandoLista(AListaComandoLista node)
    {
        defaultIn(node);
    }

    public void outAListaComandoLista(AListaComandoLista node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListaComandoLista(AListaComandoLista node)
    {
        inAListaComandoLista(node);
        if(node.getComandoLista() != null)
        {
            node.getComandoLista().apply(this);
        }
        if(node.getSeparacao() != null)
        {
            node.getSeparacao().apply(this);
        }
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        if(node.getFinal() != null)
        {
            node.getFinal().apply(this);
        }
        outAListaComandoLista(node);
    }

    public void inAAtribuicaoComando(AAtribuicaoComando node)
    {
        defaultIn(node);
    }

    public void outAAtribuicaoComando(AAtribuicaoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAtribuicaoComando(AAtribuicaoComando node)
    {
        inAAtribuicaoComando(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getSeta() != null)
        {
            node.getSeta().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outAAtribuicaoComando(node);
    }

    public void inALeiaComando(ALeiaComando node)
    {
        defaultIn(node);
    }

    public void outALeiaComando(ALeiaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALeiaComando(ALeiaComando node)
    {
        inALeiaComando(node);
        if(node.getCLeia() != null)
        {
            node.getCLeia().apply(this);
        }
        if(node.getAPar() != null)
        {
            node.getAPar().apply(this);
        }
        if(node.getVarLista() != null)
        {
            node.getVarLista().apply(this);
        }
        if(node.getFPar() != null)
        {
            node.getFPar().apply(this);
        }
        outALeiaComando(node);
    }

    public void inAEscrevaComando(AEscrevaComando node)
    {
        defaultIn(node);
    }

    public void outAEscrevaComando(AEscrevaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEscrevaComando(AEscrevaComando node)
    {
        inAEscrevaComando(node);
        if(node.getCEscreva() != null)
        {
            node.getCEscreva().apply(this);
        }
        if(node.getAPar() != null)
        {
            node.getAPar().apply(this);
        }
        if(node.getExpressaoLista() != null)
        {
            node.getExpressaoLista().apply(this);
        }
        if(node.getFPar() != null)
        {
            node.getFPar().apply(this);
        }
        outAEscrevaComando(node);
    }

    public void inAUnicaExpressaoLista(AUnicaExpressaoLista node)
    {
        defaultIn(node);
    }

    public void outAUnicaExpressaoLista(AUnicaExpressaoLista node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUnicaExpressaoLista(AUnicaExpressaoLista node)
    {
        inAUnicaExpressaoLista(node);
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outAUnicaExpressaoLista(node);
    }

    public void inASequenciaExpressaoLista(ASequenciaExpressaoLista node)
    {
        defaultIn(node);
    }

    public void outASequenciaExpressaoLista(ASequenciaExpressaoLista node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASequenciaExpressaoLista(ASequenciaExpressaoLista node)
    {
        inASequenciaExpressaoLista(node);
        if(node.getExpressaoLista() != null)
        {
            node.getExpressaoLista().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        outASequenciaExpressaoLista(node);
    }

    public void inATermoExpressao(ATermoExpressao node)
    {
        defaultIn(node);
    }

    public void outATermoExpressao(ATermoExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATermoExpressao(ATermoExpressao node)
    {
        inATermoExpressao(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        outATermoExpressao(node);
    }

    public void inASomaExpressao(ASomaExpressao node)
    {
        defaultIn(node);
    }

    public void outASomaExpressao(ASomaExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASomaExpressao(ASomaExpressao node)
    {
        inASomaExpressao(node);
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        if(node.getSoma() != null)
        {
            node.getSoma().apply(this);
        }
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        outASomaExpressao(node);
    }

    public void inASubExpressao(ASubExpressao node)
    {
        defaultIn(node);
    }

    public void outASubExpressao(ASubExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASubExpressao(ASubExpressao node)
    {
        inASubExpressao(node);
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        if(node.getSub() != null)
        {
            node.getSub().apply(this);
        }
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        outASubExpressao(node);
    }

    public void inAFatorTermo(AFatorTermo node)
    {
        defaultIn(node);
    }

    public void outAFatorTermo(AFatorTermo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFatorTermo(AFatorTermo node)
    {
        inAFatorTermo(node);
        if(node.getFator() != null)
        {
            node.getFator().apply(this);
        }
        outAFatorTermo(node);
    }

    public void inAMultTermo(AMultTermo node)
    {
        defaultIn(node);
    }

    public void outAMultTermo(AMultTermo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultTermo(AMultTermo node)
    {
        inAMultTermo(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        if(node.getMult() != null)
        {
            node.getMult().apply(this);
        }
        if(node.getFator() != null)
        {
            node.getFator().apply(this);
        }
        outAMultTermo(node);
    }

    public void inADivTermo(ADivTermo node)
    {
        defaultIn(node);
    }

    public void outADivTermo(ADivTermo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivTermo(ADivTermo node)
    {
        inADivTermo(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        if(node.getDiv() != null)
        {
            node.getDiv().apply(this);
        }
        if(node.getFator() != null)
        {
            node.getFator().apply(this);
        }
        outADivTermo(node);
    }

    public void inAIdFator(AIdFator node)
    {
        defaultIn(node);
    }

    public void outAIdFator(AIdFator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdFator(AIdFator node)
    {
        inAIdFator(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdFator(node);
    }

    public void inAInteiroFator(AInteiroFator node)
    {
        defaultIn(node);
    }

    public void outAInteiroFator(AInteiroFator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInteiroFator(AInteiroFator node)
    {
        inAInteiroFator(node);
        if(node.getInteiro() != null)
        {
            node.getInteiro().apply(this);
        }
        outAInteiroFator(node);
    }

    public void inARealFator(ARealFator node)
    {
        defaultIn(node);
    }

    public void outARealFator(ARealFator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealFator(ARealFator node)
    {
        inARealFator(node);
        if(node.getReal() != null)
        {
            node.getReal().apply(this);
        }
        outARealFator(node);
    }

    public void inAParentesesFator(AParentesesFator node)
    {
        defaultIn(node);
    }

    public void outAParentesesFator(AParentesesFator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParentesesFator(AParentesesFator node)
    {
        inAParentesesFator(node);
        if(node.getAPar() != null)
        {
            node.getAPar().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        if(node.getFPar() != null)
        {
            node.getFPar().apply(this);
        }
        outAParentesesFator(node);
    }
}
