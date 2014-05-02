/* This file was generated by SableCC (http://www.sablecc.org/). */

package src.portugol.node;

import src.portugol.analysis.*;

@SuppressWarnings("nls")
public final class AVetorVar extends PVar
{
    private TId _id_;
    private TACol _aCol_;
    private TInteiro _inteiro_;
    private TFCol _fCol_;

    public AVetorVar()
    {
        // Constructor
    }

    public AVetorVar(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TACol _aCol_,
        @SuppressWarnings("hiding") TInteiro _inteiro_,
        @SuppressWarnings("hiding") TFCol _fCol_)
    {
        // Constructor
        setId(_id_);

        setACol(_aCol_);

        setInteiro(_inteiro_);

        setFCol(_fCol_);

    }

    @Override
    public Object clone()
    {
        return new AVetorVar(
            cloneNode(this._id_),
            cloneNode(this._aCol_),
            cloneNode(this._inteiro_),
            cloneNode(this._fCol_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVetorVar(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public TACol getACol()
    {
        return this._aCol_;
    }

    public void setACol(TACol node)
    {
        if(this._aCol_ != null)
        {
            this._aCol_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aCol_ = node;
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

    public TFCol getFCol()
    {
        return this._fCol_;
    }

    public void setFCol(TFCol node)
    {
        if(this._fCol_ != null)
        {
            this._fCol_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fCol_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._aCol_)
            + toString(this._inteiro_)
            + toString(this._fCol_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._aCol_ == child)
        {
            this._aCol_ = null;
            return;
        }

        if(this._inteiro_ == child)
        {
            this._inteiro_ = null;
            return;
        }

        if(this._fCol_ == child)
        {
            this._fCol_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._aCol_ == oldChild)
        {
            setACol((TACol) newChild);
            return;
        }

        if(this._inteiro_ == oldChild)
        {
            setInteiro((TInteiro) newChild);
            return;
        }

        if(this._fCol_ == oldChild)
        {
            setFCol((TFCol) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
