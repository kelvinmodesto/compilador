/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AInteiroFator extends PFator
{
    private TInteiro _inteiro_;

    public AInteiroFator()
    {
        // Constructor
    }

    public AInteiroFator(
        @SuppressWarnings("hiding") TInteiro _inteiro_)
    {
        // Constructor
        setInteiro(_inteiro_);

    }

    @Override
    public Object clone()
    {
        return new AInteiroFator(
            cloneNode(this._inteiro_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInteiroFator(this);
    }

    public TInteiro getInteiro()
    {
        return this._inteiro_;
    }

    public void setInteiro(TInteiro node)
    {
        if(this._inteiro_ != null)
        {
            this._inteiro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inteiro_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._inteiro_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._inteiro_ == child)
        {
            this._inteiro_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._inteiro_ == oldChild)
        {
            setInteiro((TInteiro) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
