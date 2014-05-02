/* This file was generated by SableCC (http://www.sablecc.org/). */

package src.portugol.node;

import src.portugol.analysis.*;

@SuppressWarnings("nls")
public final class AUnicaVarDeclaracaoLista extends PVarDeclaracaoLista
{
    private PVarDeclaracao _varDeclaracao_;
    private TPontoVirgula _final_;

    public AUnicaVarDeclaracaoLista()
    {
        // Constructor
    }

    public AUnicaVarDeclaracaoLista(
        @SuppressWarnings("hiding") PVarDeclaracao _varDeclaracao_,
        @SuppressWarnings("hiding") TPontoVirgula _final_)
    {
        // Constructor
        setVarDeclaracao(_varDeclaracao_);

        setFinal(_final_);

    }

    @Override
    public Object clone()
    {
        return new AUnicaVarDeclaracaoLista(
            cloneNode(this._varDeclaracao_),
            cloneNode(this._final_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnicaVarDeclaracaoLista(this);
    }

    public PVarDeclaracao getVarDeclaracao()
    {
        return this._varDeclaracao_;
    }

    public void setVarDeclaracao(PVarDeclaracao node)
    {
        if(this._varDeclaracao_ != null)
        {
            this._varDeclaracao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._varDeclaracao_ = node;
    }

    public TPontoVirgula getFinal()
    {
        return this._final_;
    }

    public void setFinal(TPontoVirgula node)
    {
        if(this._final_ != null)
        {
            this._final_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._final_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._varDeclaracao_)
            + toString(this._final_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._varDeclaracao_ == child)
        {
            this._varDeclaracao_ = null;
            return;
        }

        if(this._final_ == child)
        {
            this._final_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._varDeclaracao_ == oldChild)
        {
            setVarDeclaracao((PVarDeclaracao) newChild);
            return;
        }

        if(this._final_ == oldChild)
        {
            setFinal((TPontoVirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
