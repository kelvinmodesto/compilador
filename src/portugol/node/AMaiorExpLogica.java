/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AMaiorExpLogica extends PExpLogica
{
    private PExpressao _exp1_;
    private TMaior _maior_;
    private PExpressao _exp2_;

    public AMaiorExpLogica()
    {
        // Constructor
    }

    public AMaiorExpLogica(
        @SuppressWarnings("hiding") PExpressao _exp1_,
        @SuppressWarnings("hiding") TMaior _maior_,
        @SuppressWarnings("hiding") PExpressao _exp2_)
    {
        // Constructor
        setExp1(_exp1_);

        setMaior(_maior_);

        setExp2(_exp2_);

    }

    @Override
    public Object clone()
    {
        return new AMaiorExpLogica(
            cloneNode(this._exp1_),
            cloneNode(this._maior_),
            cloneNode(this._exp2_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMaiorExpLogica(this);
    }

    public PExpressao getExp1()
    {
        return this._exp1_;
    }

    public void setExp1(PExpressao node)
    {
        if(this._exp1_ != null)
        {
            this._exp1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp1_ = node;
    }

    public TMaior getMaior()
    {
        return this._maior_;
    }

    public void setMaior(TMaior node)
    {
        if(this._maior_ != null)
        {
            this._maior_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._maior_ = node;
    }

    public PExpressao getExp2()
    {
        return this._exp2_;
    }

    public void setExp2(PExpressao node)
    {
        if(this._exp2_ != null)
        {
            this._exp2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp2_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp1_)
            + toString(this._maior_)
            + toString(this._exp2_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp1_ == child)
        {
            this._exp1_ = null;
            return;
        }

        if(this._maior_ == child)
        {
            this._maior_ = null;
            return;
        }

        if(this._exp2_ == child)
        {
            this._exp2_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp1_ == oldChild)
        {
            setExp1((PExpressao) newChild);
            return;
        }

        if(this._maior_ == oldChild)
        {
            setMaior((TMaior) newChild);
            return;
        }

        if(this._exp2_ == oldChild)
        {
            setExp2((PExpressao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
