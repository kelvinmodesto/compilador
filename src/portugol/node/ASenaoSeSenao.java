/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class ASenaoSeSenao extends PSeSenao
{
    private TCSenao _cSenao_;
    private PComandos _comandos_;

    public ASenaoSeSenao()
    {
        // Constructor
    }

    public ASenaoSeSenao(
        @SuppressWarnings("hiding") TCSenao _cSenao_,
        @SuppressWarnings("hiding") PComandos _comandos_)
    {
        // Constructor
        setCSenao(_cSenao_);

        setComandos(_comandos_);

    }

    @Override
    public Object clone()
    {
        return new ASenaoSeSenao(
            cloneNode(this._cSenao_),
            cloneNode(this._comandos_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASenaoSeSenao(this);
    }

    public TCSenao getCSenao()
    {
        return this._cSenao_;
    }

    public void setCSenao(TCSenao node)
    {
        if(this._cSenao_ != null)
        {
            this._cSenao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cSenao_ = node;
    }

    public PComandos getComandos()
    {
        return this._comandos_;
    }

    public void setComandos(PComandos node)
    {
        if(this._comandos_ != null)
        {
            this._comandos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comandos_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._cSenao_)
            + toString(this._comandos_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._cSenao_ == child)
        {
            this._cSenao_ = null;
            return;
        }

        if(this._comandos_ == child)
        {
            this._comandos_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._cSenao_ == oldChild)
        {
            setCSenao((TCSenao) newChild);
            return;
        }

        if(this._comandos_ == oldChild)
        {
            setComandos((PComandos) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}