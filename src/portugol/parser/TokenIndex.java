/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.parser;

import portugol.node.*;
import portugol.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTId(@SuppressWarnings("unused") TId node)
    {
        this.index = 0;
    }

    @Override
    public void caseTCPrograma(@SuppressWarnings("unused") TCPrograma node)
    {
        this.index = 1;
    }

    @Override
    public void caseTCInicio(@SuppressWarnings("unused") TCInicio node)
    {
        this.index = 2;
    }

    @Override
    public void caseTCFim(@SuppressWarnings("unused") TCFim node)
    {
        this.index = 3;
    }

    @Override
    public void caseTCConst(@SuppressWarnings("unused") TCConst node)
    {
        this.index = 4;
    }

    @Override
    public void caseTCReal(@SuppressWarnings("unused") TCReal node)
    {
        this.index = 5;
    }

    @Override
    public void caseTCInteiro(@SuppressWarnings("unused") TCInteiro node)
    {
        this.index = 6;
    }

    @Override
    public void caseTCCaractere(@SuppressWarnings("unused") TCCaractere node)
    {
        this.index = 7;
    }

    @Override
    public void caseTCLeia(@SuppressWarnings("unused") TCLeia node)
    {
        this.index = 8;
    }

    @Override
    public void caseTCEscreva(@SuppressWarnings("unused") TCEscreva node)
    {
        this.index = 9;
    }

    @Override
    public void caseTCSe(@SuppressWarnings("unused") TCSe node)
    {
        this.index = 10;
    }

    @Override
    public void caseTCEntao(@SuppressWarnings("unused") TCEntao node)
    {
        this.index = 11;
    }

    @Override
    public void caseTCSenao(@SuppressWarnings("unused") TCSenao node)
    {
        this.index = 12;
    }

    @Override
    public void caseTCFimSe(@SuppressWarnings("unused") TCFimSe node)
    {
        this.index = 13;
    }

    @Override
    public void caseTCAvalie(@SuppressWarnings("unused") TCAvalie node)
    {
        this.index = 14;
    }

    @Override
    public void caseTCCaso(@SuppressWarnings("unused") TCCaso node)
    {
        this.index = 15;
    }

    @Override
    public void caseTCFimAvalie(@SuppressWarnings("unused") TCFimAvalie node)
    {
        this.index = 16;
    }

    @Override
    public void caseTCEnquanto(@SuppressWarnings("unused") TCEnquanto node)
    {
        this.index = 17;
    }

    @Override
    public void caseTCFaca(@SuppressWarnings("unused") TCFaca node)
    {
        this.index = 18;
    }

    @Override
    public void caseTCFimEnquanto(@SuppressWarnings("unused") TCFimEnquanto node)
    {
        this.index = 19;
    }

    @Override
    public void caseTCRepita(@SuppressWarnings("unused") TCRepita node)
    {
        this.index = 20;
    }

    @Override
    public void caseTCAte(@SuppressWarnings("unused") TCAte node)
    {
        this.index = 21;
    }

    @Override
    public void caseTCPara(@SuppressWarnings("unused") TCPara node)
    {
        this.index = 22;
    }

    @Override
    public void caseTCDe(@SuppressWarnings("unused") TCDe node)
    {
        this.index = 23;
    }

    @Override
    public void caseTCFimPara(@SuppressWarnings("unused") TCFimPara node)
    {
        this.index = 24;
    }

    @Override
    public void caseTCPasso(@SuppressWarnings("unused") TCPasso node)
    {
        this.index = 25;
    }

    @Override
    public void caseTInteiro(@SuppressWarnings("unused") TInteiro node)
    {
        this.index = 26;
    }

    @Override
    public void caseTString(@SuppressWarnings("unused") TString node)
    {
        this.index = 27;
    }

    @Override
    public void caseTReal(@SuppressWarnings("unused") TReal node)
    {
        this.index = 28;
    }

    @Override
    public void caseTSoma(@SuppressWarnings("unused") TSoma node)
    {
        this.index = 29;
    }

    @Override
    public void caseTSub(@SuppressWarnings("unused") TSub node)
    {
        this.index = 30;
    }

    @Override
    public void caseTMult(@SuppressWarnings("unused") TMult node)
    {
        this.index = 31;
    }

    @Override
    public void caseTDiv(@SuppressWarnings("unused") TDiv node)
    {
        this.index = 32;
    }

    @Override
    public void caseTMenor(@SuppressWarnings("unused") TMenor node)
    {
        this.index = 33;
    }

    @Override
    public void caseTMaior(@SuppressWarnings("unused") TMaior node)
    {
        this.index = 34;
    }

    @Override
    public void caseTMenorIgual(@SuppressWarnings("unused") TMenorIgual node)
    {
        this.index = 35;
    }

    @Override
    public void caseTMaiorIgual(@SuppressWarnings("unused") TMaiorIgual node)
    {
        this.index = 36;
    }

    @Override
    public void caseTIgual(@SuppressWarnings("unused") TIgual node)
    {
        this.index = 37;
    }

    @Override
    public void caseTDif(@SuppressWarnings("unused") TDif node)
    {
        this.index = 38;
    }

    @Override
    public void caseTSeta(@SuppressWarnings("unused") TSeta node)
    {
        this.index = 39;
    }

    @Override
    public void caseTNao(@SuppressWarnings("unused") TNao node)
    {
        this.index = 40;
    }

    @Override
    public void caseTE(@SuppressWarnings("unused") TE node)
    {
        this.index = 41;
    }

    @Override
    public void caseTOu(@SuppressWarnings("unused") TOu node)
    {
        this.index = 42;
    }

    @Override
    public void caseTXor(@SuppressWarnings("unused") TXor node)
    {
        this.index = 43;
    }

    @Override
    public void caseTPonto(@SuppressWarnings("unused") TPonto node)
    {
        this.index = 44;
    }

    @Override
    public void caseTVirgula(@SuppressWarnings("unused") TVirgula node)
    {
        this.index = 45;
    }

    @Override
    public void caseTDoisPontos(@SuppressWarnings("unused") TDoisPontos node)
    {
        this.index = 46;
    }

    @Override
    public void caseTPontoVirgula(@SuppressWarnings("unused") TPontoVirgula node)
    {
        this.index = 47;
    }

    @Override
    public void caseTAPar(@SuppressWarnings("unused") TAPar node)
    {
        this.index = 48;
    }

    @Override
    public void caseTFPar(@SuppressWarnings("unused") TFPar node)
    {
        this.index = 49;
    }

    @Override
    public void caseTACol(@SuppressWarnings("unused") TACol node)
    {
        this.index = 50;
    }

    @Override
    public void caseTFCol(@SuppressWarnings("unused") TFCol node)
    {
        this.index = 51;
    }

    @Override
    public void caseTACha(@SuppressWarnings("unused") TACha node)
    {
        this.index = 52;
    }

    @Override
    public void caseTFCha(@SuppressWarnings("unused") TFCha node)
    {
        this.index = 53;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 54;
    }
}