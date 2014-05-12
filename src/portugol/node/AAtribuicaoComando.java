/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AAtribuicaoComando extends PComando
{
    private PAtribuicao _atribuicao_;

    public AAtribuicaoComando()
    {
        // Constructor
    }

    public AAtribuicaoComando(
        @SuppressWarnings("hiding") PAtribuicao _atribuicao_)
    {
        // Constructor
        setAtribuicao(_atribuicao_);

    }

    @Override
    public Object clone()
    {
        return new AAtribuicaoComando(
            cloneNode(this._atribuicao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAtribuicaoComando(this);
    }

    public PAtribuicao getAtribuicao()
    {
        return this._atribuicao_;
    }

    public void setAtribuicao(PAtribuicao node)
    {
        if(this._atribuicao_ != null)
        {
            this._atribuicao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._atribuicao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._atribuicao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._atribuicao_ == child)
        {
            this._atribuicao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._atribuicao_ == oldChild)
        {
            setAtribuicao((PAtribuicao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}