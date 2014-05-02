/* This file was generated by SableCC (http://www.sablecc.org/). */

package src.portugol.node;

import src.portugol.analysis.*;

@SuppressWarnings("nls")
public final class ACorpo extends PCorpo
{
    private PComandoLista _comandoLista_;

    public ACorpo()
    {
        // Constructor
    }

    public ACorpo(
        @SuppressWarnings("hiding") PComandoLista _comandoLista_)
    {
        // Constructor
        setComandoLista(_comandoLista_);

    }

    @Override
    public Object clone()
    {
        return new ACorpo(
            cloneNode(this._comandoLista_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACorpo(this);
    }

    public PComandoLista getComandoLista()
    {
        return this._comandoLista_;
    }

    public void setComandoLista(PComandoLista node)
    {
        if(this._comandoLista_ != null)
        {
            this._comandoLista_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comandoLista_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comandoLista_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comandoLista_ == child)
        {
            this._comandoLista_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._comandoLista_ == oldChild)
        {
            setComandoLista((PComandoLista) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
