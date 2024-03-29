/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.analysis;

import java.util.*;
import portugol.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
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
        node.getEOF().apply(this);
        node.getPPrograma().apply(this);
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
        if(node.getPonto() != null)
        {
            node.getPonto().apply(this);
        }
        if(node.getCFim() != null)
        {
            node.getCFim().apply(this);
        }
        if(node.getComandos() != null)
        {
            node.getComandos().apply(this);
        }
        if(node.getDeclaracoes() != null)
        {
            node.getDeclaracoes().apply(this);
        }
        if(node.getCabecalho() != null)
        {
            node.getCabecalho().apply(this);
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
        if(node.getCInicio() != null)
        {
            node.getCInicio().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getCPrograma() != null)
        {
            node.getCPrograma().apply(this);
        }
        outACabecalho(node);
    }

    public void inADeclaracaoDeclaracoes(ADeclaracaoDeclaracoes node)
    {
        defaultIn(node);
    }

    public void outADeclaracaoDeclaracoes(ADeclaracaoDeclaracoes node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclaracaoDeclaracoes(ADeclaracaoDeclaracoes node)
    {
        inADeclaracaoDeclaracoes(node);
        if(node.getDeclaracao() != null)
        {
            node.getDeclaracao().apply(this);
        }
        outADeclaracaoDeclaracoes(node);
    }

    public void inADeclaracoesDeclaracoes(ADeclaracoesDeclaracoes node)
    {
        defaultIn(node);
    }

    public void outADeclaracoesDeclaracoes(ADeclaracoesDeclaracoes node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclaracoesDeclaracoes(ADeclaracoesDeclaracoes node)
    {
        inADeclaracoesDeclaracoes(node);
        if(node.getDeclaracao() != null)
        {
            node.getDeclaracao().apply(this);
        }
        if(node.getDeclaracoes() != null)
        {
            node.getDeclaracoes().apply(this);
        }
        outADeclaracoesDeclaracoes(node);
    }

    public void inAVarDeclaracaoDeclaracao(AVarDeclaracaoDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAVarDeclaracaoDeclaracao(AVarDeclaracaoDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarDeclaracaoDeclaracao(AVarDeclaracaoDeclaracao node)
    {
        inAVarDeclaracaoDeclaracao(node);
        if(node.getVarDeclaracao() != null)
        {
            node.getVarDeclaracao().apply(this);
        }
        outAVarDeclaracaoDeclaracao(node);
    }

    public void inAConstDeclaracaoDeclaracao(AConstDeclaracaoDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAConstDeclaracaoDeclaracao(AConstDeclaracaoDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConstDeclaracaoDeclaracao(AConstDeclaracaoDeclaracao node)
    {
        inAConstDeclaracaoDeclaracao(node);
        if(node.getConstDeclaracao() != null)
        {
            node.getConstDeclaracao().apply(this);
        }
        outAConstDeclaracaoDeclaracao(node);
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
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        {
            List<PMaisVars> copy = new ArrayList<PMaisVars>(node.getMaisVars());
            Collections.reverse(copy);
            for(PMaisVars e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getDoisPontos() != null)
        {
            node.getDoisPontos().apply(this);
        }
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
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

    public void inAMaisVars(AMaisVars node)
    {
        defaultIn(node);
    }

    public void outAMaisVars(AMaisVars node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaisVars(AMaisVars node)
    {
        inAMaisVars(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        outAMaisVars(node);
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
        if(node.getFCol() != null)
        {
            node.getFCol().apply(this);
        }
        if(node.getInteiro() != null)
        {
            node.getInteiro().apply(this);
        }
        if(node.getACol() != null)
        {
            node.getACol().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAVetorVar(node);
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
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getCConst() != null)
        {
            node.getCConst().apply(this);
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

    public void inAComandoComandos(AComandoComandos node)
    {
        defaultIn(node);
    }

    public void outAComandoComandos(AComandoComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoComandos(AComandoComandos node)
    {
        inAComandoComandos(node);
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        outAComandoComandos(node);
    }

    public void inAComandosComandos(AComandosComandos node)
    {
        defaultIn(node);
    }

    public void outAComandosComandos(AComandosComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandosComandos(AComandosComandos node)
    {
        inAComandosComandos(node);
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        if(node.getComandos() != null)
        {
            node.getComandos().apply(this);
        }
        outAComandosComandos(node);
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
        if(node.getLeia() != null)
        {
            node.getLeia().apply(this);
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
        if(node.getEscreva() != null)
        {
            node.getEscreva().apply(this);
        }
        outAEscrevaComando(node);
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
        if(node.getAtribuicao() != null)
        {
            node.getAtribuicao().apply(this);
        }
        outAAtribuicaoComando(node);
    }

    public void inASeComando(ASeComando node)
    {
        defaultIn(node);
    }

    public void outASeComando(ASeComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeComando(ASeComando node)
    {
        inASeComando(node);
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        if(node.getCFimSe() != null)
        {
            node.getCFimSe().apply(this);
        }
        if(node.getSeSenao() != null)
        {
            node.getSeSenao().apply(this);
        }
        if(node.getComandos() != null)
        {
            node.getComandos().apply(this);
        }
        if(node.getCEntao() != null)
        {
            node.getCEntao().apply(this);
        }
        if(node.getFPar() != null)
        {
            node.getFPar().apply(this);
        }
        if(node.getExpressaoLogica() != null)
        {
            node.getExpressaoLogica().apply(this);
        }
        if(node.getAPar() != null)
        {
            node.getAPar().apply(this);
        }
        if(node.getCSe() != null)
        {
            node.getCSe().apply(this);
        }
        outASeComando(node);
    }

    public void inAAvalieComando(AAvalieComando node)
    {
        defaultIn(node);
    }

    public void outAAvalieComando(AAvalieComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAvalieComando(AAvalieComando node)
    {
        inAAvalieComando(node);
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        if(node.getCFimAvalie() != null)
        {
            node.getCFimAvalie().apply(this);
        }
        if(node.getCasoSenao() != null)
        {
            node.getCasoSenao().apply(this);
        }
        {
            List<PCaso> copy = new ArrayList<PCaso>(node.getCaso());
            Collections.reverse(copy);
            for(PCaso e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getFPar() != null)
        {
            node.getFPar().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        if(node.getAPar() != null)
        {
            node.getAPar().apply(this);
        }
        if(node.getCAvalie() != null)
        {
            node.getCAvalie().apply(this);
        }
        outAAvalieComando(node);
    }

    public void inAEnquantoComando(AEnquantoComando node)
    {
        defaultIn(node);
    }

    public void outAEnquantoComando(AEnquantoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEnquantoComando(AEnquantoComando node)
    {
        inAEnquantoComando(node);
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        if(node.getCFimEnquanto() != null)
        {
            node.getCFimEnquanto().apply(this);
        }
        if(node.getComandos() != null)
        {
            node.getComandos().apply(this);
        }
        if(node.getCFaca() != null)
        {
            node.getCFaca().apply(this);
        }
        if(node.getFPar() != null)
        {
            node.getFPar().apply(this);
        }
        if(node.getExpressaoLogica() != null)
        {
            node.getExpressaoLogica().apply(this);
        }
        if(node.getAPar() != null)
        {
            node.getAPar().apply(this);
        }
        if(node.getCEnquanto() != null)
        {
            node.getCEnquanto().apply(this);
        }
        outAEnquantoComando(node);
    }

    public void inARepitaComando(ARepitaComando node)
    {
        defaultIn(node);
    }

    public void outARepitaComando(ARepitaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARepitaComando(ARepitaComando node)
    {
        inARepitaComando(node);
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        if(node.getFPar() != null)
        {
            node.getFPar().apply(this);
        }
        if(node.getExpressaoLogica() != null)
        {
            node.getExpressaoLogica().apply(this);
        }
        if(node.getAPar() != null)
        {
            node.getAPar().apply(this);
        }
        if(node.getCAte() != null)
        {
            node.getCAte().apply(this);
        }
        if(node.getComandos() != null)
        {
            node.getComandos().apply(this);
        }
        if(node.getCRepita() != null)
        {
            node.getCRepita().apply(this);
        }
        outARepitaComando(node);
    }

    public void inAParaComando(AParaComando node)
    {
        defaultIn(node);
    }

    public void outAParaComando(AParaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaComando(AParaComando node)
    {
        inAParaComando(node);
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        if(node.getCFimPara() != null)
        {
            node.getCFimPara().apply(this);
        }
        if(node.getComandos() != null)
        {
            node.getComandos().apply(this);
        }
        if(node.getCFaca() != null)
        {
            node.getCFaca().apply(this);
        }
        if(node.getAte() != null)
        {
            node.getAte().apply(this);
        }
        if(node.getCAte() != null)
        {
            node.getCAte().apply(this);
        }
        if(node.getDe() != null)
        {
            node.getDe().apply(this);
        }
        if(node.getCDe() != null)
        {
            node.getCDe().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getCPara() != null)
        {
            node.getCPara().apply(this);
        }
        outAParaComando(node);
    }

    public void inAParaPassoComando(AParaPassoComando node)
    {
        defaultIn(node);
    }

    public void outAParaPassoComando(AParaPassoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaPassoComando(AParaPassoComando node)
    {
        inAParaPassoComando(node);
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        if(node.getCFimPara() != null)
        {
            node.getCFimPara().apply(this);
        }
        if(node.getComandos() != null)
        {
            node.getComandos().apply(this);
        }
        if(node.getCFaca() != null)
        {
            node.getCFaca().apply(this);
        }
        if(node.getAte() != null)
        {
            node.getAte().apply(this);
        }
        if(node.getCAte() != null)
        {
            node.getCAte().apply(this);
        }
        if(node.getPasso() != null)
        {
            node.getPasso().apply(this);
        }
        if(node.getCPasso() != null)
        {
            node.getCPasso().apply(this);
        }
        if(node.getDe() != null)
        {
            node.getDe().apply(this);
        }
        if(node.getCDe() != null)
        {
            node.getCDe().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getCPara() != null)
        {
            node.getCPara().apply(this);
        }
        outAParaPassoComando(node);
    }

    public void inAVazioSeSenao(AVazioSeSenao node)
    {
        defaultIn(node);
    }

    public void outAVazioSeSenao(AVazioSeSenao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVazioSeSenao(AVazioSeSenao node)
    {
        inAVazioSeSenao(node);
        outAVazioSeSenao(node);
    }

    public void inASenaoSeSenao(ASenaoSeSenao node)
    {
        defaultIn(node);
    }

    public void outASenaoSeSenao(ASenaoSeSenao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASenaoSeSenao(ASenaoSeSenao node)
    {
        inASenaoSeSenao(node);
        if(node.getComandos() != null)
        {
            node.getComandos().apply(this);
        }
        if(node.getCSenao() != null)
        {
            node.getCSenao().apply(this);
        }
        outASenaoSeSenao(node);
    }

    public void inACasoCaso(ACasoCaso node)
    {
        defaultIn(node);
    }

    public void outACasoCaso(ACasoCaso node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACasoCaso(ACasoCaso node)
    {
        inACasoCaso(node);
        if(node.getComandos() != null)
        {
            node.getComandos().apply(this);
        }
        if(node.getDoisPontos() != null)
        {
            node.getDoisPontos().apply(this);
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        if(node.getCCaso() != null)
        {
            node.getCCaso().apply(this);
        }
        outACasoCaso(node);
    }

    public void inAVazioCasoSenao(AVazioCasoSenao node)
    {
        defaultIn(node);
    }

    public void outAVazioCasoSenao(AVazioCasoSenao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVazioCasoSenao(AVazioCasoSenao node)
    {
        inAVazioCasoSenao(node);
        outAVazioCasoSenao(node);
    }

    public void inASenaoCasoSenao(ASenaoCasoSenao node)
    {
        defaultIn(node);
    }

    public void outASenaoCasoSenao(ASenaoCasoSenao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASenaoCasoSenao(ASenaoCasoSenao node)
    {
        inASenaoCasoSenao(node);
        if(node.getComandos() != null)
        {
            node.getComandos().apply(this);
        }
        if(node.getDoisPontos() != null)
        {
            node.getDoisPontos().apply(this);
        }
        if(node.getCSenao() != null)
        {
            node.getCSenao().apply(this);
        }
        outASenaoCasoSenao(node);
    }

    public void inAAtribuicao(AAtribuicao node)
    {
        defaultIn(node);
    }

    public void outAAtribuicao(AAtribuicao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAtribuicao(AAtribuicao node)
    {
        inAAtribuicao(node);
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        if(node.getAtrib() != null)
        {
            node.getAtrib().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAAtribuicao(node);
    }

    public void inALeia(ALeia node)
    {
        defaultIn(node);
    }

    public void outALeia(ALeia node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALeia(ALeia node)
    {
        inALeia(node);
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        if(node.getFPar() != null)
        {
            node.getFPar().apply(this);
        }
        {
            List<PMaisVars> copy = new ArrayList<PMaisVars>(node.getMaisVars());
            Collections.reverse(copy);
            for(PMaisVars e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getAPar() != null)
        {
            node.getAPar().apply(this);
        }
        if(node.getCLeia() != null)
        {
            node.getCLeia().apply(this);
        }
        outALeia(node);
    }

    public void inAEscreva(AEscreva node)
    {
        defaultIn(node);
    }

    public void outAEscreva(AEscreva node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEscreva(AEscreva node)
    {
        inAEscreva(node);
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        if(node.getFPar() != null)
        {
            node.getFPar().apply(this);
        }
        {
            List<PMaisExpressao> copy = new ArrayList<PMaisExpressao>(node.getMaisExpressao());
            Collections.reverse(copy);
            for(PMaisExpressao e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        if(node.getAPar() != null)
        {
            node.getAPar().apply(this);
        }
        if(node.getCEscreva() != null)
        {
            node.getCEscreva().apply(this);
        }
        outAEscreva(node);
    }

    public void inAMaisExpressao(AMaisExpressao node)
    {
        defaultIn(node);
    }

    public void outAMaisExpressao(AMaisExpressao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaisExpressao(AMaisExpressao node)
    {
        inAMaisExpressao(node);
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        outAMaisExpressao(node);
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
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        if(node.getSoma() != null)
        {
            node.getSoma().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
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
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        if(node.getSub() != null)
        {
            node.getSub().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
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
        if(node.getFator() != null)
        {
            node.getFator().apply(this);
        }
        if(node.getMult() != null)
        {
            node.getMult().apply(this);
        }
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
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
        if(node.getFator() != null)
        {
            node.getFator().apply(this);
        }
        if(node.getDiv() != null)
        {
            node.getDiv().apply(this);
        }
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
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
        if(node.getFPar() != null)
        {
            node.getFPar().apply(this);
        }
        if(node.getExpressao() != null)
        {
            node.getExpressao().apply(this);
        }
        if(node.getAPar() != null)
        {
            node.getAPar().apply(this);
        }
        outAParentesesFator(node);
    }

    public void inAExpLogicaExpressaoLogica(AExpLogicaExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAExpLogicaExpressaoLogica(AExpLogicaExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpLogicaExpressaoLogica(AExpLogicaExpressaoLogica node)
    {
        inAExpLogicaExpressaoLogica(node);
        if(node.getExpsLogicas() != null)
        {
            node.getExpsLogicas().apply(this);
        }
        outAExpLogicaExpressaoLogica(node);
    }

    public void inAEExpLogicaExpressaoLogica(AEExpLogicaExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAEExpLogicaExpressaoLogica(AEExpLogicaExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEExpLogicaExpressaoLogica(AEExpLogicaExpressaoLogica node)
    {
        inAEExpLogicaExpressaoLogica(node);
        if(node.getExpsLogicas() != null)
        {
            node.getExpsLogicas().apply(this);
        }
        if(node.getE() != null)
        {
            node.getE().apply(this);
        }
        if(node.getExpressaoLogica() != null)
        {
            node.getExpressaoLogica().apply(this);
        }
        outAEExpLogicaExpressaoLogica(node);
    }

    public void inAOuExpLogicaExpressaoLogica(AOuExpLogicaExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAOuExpLogicaExpressaoLogica(AOuExpLogicaExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOuExpLogicaExpressaoLogica(AOuExpLogicaExpressaoLogica node)
    {
        inAOuExpLogicaExpressaoLogica(node);
        if(node.getExpsLogicas() != null)
        {
            node.getExpsLogicas().apply(this);
        }
        if(node.getOu() != null)
        {
            node.getOu().apply(this);
        }
        if(node.getExpressaoLogica() != null)
        {
            node.getExpressaoLogica().apply(this);
        }
        outAOuExpLogicaExpressaoLogica(node);
    }

    public void inAXorExpLogicaExpressaoLogica(AXorExpLogicaExpressaoLogica node)
    {
        defaultIn(node);
    }

    public void outAXorExpLogicaExpressaoLogica(AXorExpLogicaExpressaoLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAXorExpLogicaExpressaoLogica(AXorExpLogicaExpressaoLogica node)
    {
        inAXorExpLogicaExpressaoLogica(node);
        if(node.getExpsLogicas() != null)
        {
            node.getExpsLogicas().apply(this);
        }
        if(node.getXor() != null)
        {
            node.getXor().apply(this);
        }
        if(node.getExpressaoLogica() != null)
        {
            node.getExpressaoLogica().apply(this);
        }
        outAXorExpLogicaExpressaoLogica(node);
    }

    public void inAExpLogicaExpsLogicas(AExpLogicaExpsLogicas node)
    {
        defaultIn(node);
    }

    public void outAExpLogicaExpsLogicas(AExpLogicaExpsLogicas node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpLogicaExpsLogicas(AExpLogicaExpsLogicas node)
    {
        inAExpLogicaExpsLogicas(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outAExpLogicaExpsLogicas(node);
    }

    public void inANaoExpLogicaExpsLogicas(ANaoExpLogicaExpsLogicas node)
    {
        defaultIn(node);
    }

    public void outANaoExpLogicaExpsLogicas(ANaoExpLogicaExpsLogicas node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANaoExpLogicaExpsLogicas(ANaoExpLogicaExpsLogicas node)
    {
        inANaoExpLogicaExpsLogicas(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        if(node.getNao() != null)
        {
            node.getNao().apply(this);
        }
        outANaoExpLogicaExpsLogicas(node);
    }

    public void inAIgualExpLogica(AIgualExpLogica node)
    {
        defaultIn(node);
    }

    public void outAIgualExpLogica(AIgualExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIgualExpLogica(AIgualExpLogica node)
    {
        inAIgualExpLogica(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        if(node.getIgual() != null)
        {
            node.getIgual().apply(this);
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        outAIgualExpLogica(node);
    }

    public void inADifExpLogica(ADifExpLogica node)
    {
        defaultIn(node);
    }

    public void outADifExpLogica(ADifExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADifExpLogica(ADifExpLogica node)
    {
        inADifExpLogica(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        if(node.getDif() != null)
        {
            node.getDif().apply(this);
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        outADifExpLogica(node);
    }

    public void inAMenorIgualExpLogica(AMenorIgualExpLogica node)
    {
        defaultIn(node);
    }

    public void outAMenorIgualExpLogica(AMenorIgualExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorIgualExpLogica(AMenorIgualExpLogica node)
    {
        inAMenorIgualExpLogica(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        if(node.getMenorIgual() != null)
        {
            node.getMenorIgual().apply(this);
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        outAMenorIgualExpLogica(node);
    }

    public void inAMaiorIgualExpLogica(AMaiorIgualExpLogica node)
    {
        defaultIn(node);
    }

    public void outAMaiorIgualExpLogica(AMaiorIgualExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorIgualExpLogica(AMaiorIgualExpLogica node)
    {
        inAMaiorIgualExpLogica(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        if(node.getMaiorIgual() != null)
        {
            node.getMaiorIgual().apply(this);
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        outAMaiorIgualExpLogica(node);
    }

    public void inAMenorExpLogica(AMenorExpLogica node)
    {
        defaultIn(node);
    }

    public void outAMenorExpLogica(AMenorExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorExpLogica(AMenorExpLogica node)
    {
        inAMenorExpLogica(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        if(node.getMenor() != null)
        {
            node.getMenor().apply(this);
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        outAMenorExpLogica(node);
    }

    public void inAMaiorExpLogica(AMaiorExpLogica node)
    {
        defaultIn(node);
    }

    public void outAMaiorExpLogica(AMaiorExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorExpLogica(AMaiorExpLogica node)
    {
        inAMaiorExpLogica(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        if(node.getMaior() != null)
        {
            node.getMaior().apply(this);
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        outAMaiorExpLogica(node);
    }

    public void inAParentesesExpLogica(AParentesesExpLogica node)
    {
        defaultIn(node);
    }

    public void outAParentesesExpLogica(AParentesesExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParentesesExpLogica(AParentesesExpLogica node)
    {
        inAParentesesExpLogica(node);
        if(node.getFPar() != null)
        {
            node.getFPar().apply(this);
        }
        if(node.getExpressaoLogica() != null)
        {
            node.getExpressaoLogica().apply(this);
        }
        if(node.getAPar() != null)
        {
            node.getAPar().apply(this);
        }
        outAParentesesExpLogica(node);
    }
}
