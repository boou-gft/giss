/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Ocorrencias.java,v 1.1 2017/04/11 14:10:18 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class Ocorrencias.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:10:18 $
 */
public class Ocorrencias implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _contaContabil
     */
    private long _contaContabil = 0;

    /**
     * keeps track of state for field: _contaContabil
     */
    private boolean _has_contaContabil;

    /**
     * Field _motivoList
     */
    private java.util.Vector _motivoList;

    /**
     * Field _tributavelList
     */
    private java.util.Vector _tributavelList;

    /**
     * Field _percentualAliquotaConta
     */
    private double _percentualAliquotaConta = 0;

    /**
     * keeps track of state for field: _percentualAliquotaConta
     */
    private boolean _has_percentualAliquotaConta;

    /**
     * Field _issList
     */
    private java.util.Vector _issList;

    /**
     * Field _issmensalList
     */
    private java.util.Vector _issmensalList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
        _motivoList = new Vector();
        _tributavelList = new Vector();
        _issList = new Vector();
        _issmensalList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Ocorrencias()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addIss
     * 
     * 
     * 
     * @param vIss
     */
    public void addIss(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Iss vIss)
        throws java.lang.IndexOutOfBoundsException
    {
        _issList.addElement(vIss);
    } //-- void addIss(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Iss) 

    /**
     * Method addIss
     * 
     * 
     * 
     * @param index
     * @param vIss
     */
    public void addIss(int index, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Iss vIss)
        throws java.lang.IndexOutOfBoundsException
    {
        _issList.insertElementAt(vIss, index);
    } //-- void addIss(int, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Iss) 

    /**
     * Method addIssmensal
     * 
     * 
     * 
     * @param vIssmensal
     */
    public void addIssmensal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Issmensal vIssmensal)
        throws java.lang.IndexOutOfBoundsException
    {
        _issmensalList.addElement(vIssmensal);
    } //-- void addIssmensal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Issmensal) 

    /**
     * Method addIssmensal
     * 
     * 
     * 
     * @param index
     * @param vIssmensal
     */
    public void addIssmensal(int index, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Issmensal vIssmensal)
        throws java.lang.IndexOutOfBoundsException
    {
        _issmensalList.insertElementAt(vIssmensal, index);
    } //-- void addIssmensal(int, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Issmensal) 

    /**
     * Method addMotivo
     * 
     * 
     * 
     * @param vMotivo
     */
    public void addMotivo(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Motivo vMotivo)
        throws java.lang.IndexOutOfBoundsException
    {
        _motivoList.addElement(vMotivo);
    } //-- void addMotivo(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Motivo) 

    /**
     * Method addMotivo
     * 
     * 
     * 
     * @param index
     * @param vMotivo
     */
    public void addMotivo(int index, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Motivo vMotivo)
        throws java.lang.IndexOutOfBoundsException
    {
        _motivoList.insertElementAt(vMotivo, index);
    } //-- void addMotivo(int, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Motivo) 

    /**
     * Method addTributavel
     * 
     * 
     * 
     * @param vTributavel
     */
    public void addTributavel(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Tributavel vTributavel)
        throws java.lang.IndexOutOfBoundsException
    {
        _tributavelList.addElement(vTributavel);
    } //-- void addTributavel(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Tributavel) 

    /**
     * Method addTributavel
     * 
     * 
     * 
     * @param index
     * @param vTributavel
     */
    public void addTributavel(int index, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Tributavel vTributavel)
        throws java.lang.IndexOutOfBoundsException
    {
        _tributavelList.insertElementAt(vTributavel, index);
    } //-- void addTributavel(int, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Tributavel) 

    /**
     * Method deleteContaContabil
     * 
     */
    public void deleteContaContabil()
    {
        this._has_contaContabil= false;
    } //-- void deleteContaContabil() 

    /**
     * Method deletePercentualAliquotaConta
     * 
     */
    public void deletePercentualAliquotaConta()
    {
        this._has_percentualAliquotaConta= false;
    } //-- void deletePercentualAliquotaConta() 

    /**
     * Method enumerateIss
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateIss()
    {
        return _issList.elements();
    } //-- java.util.Enumeration enumerateIss() 

    /**
     * Method enumerateIssmensal
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateIssmensal()
    {
        return _issmensalList.elements();
    } //-- java.util.Enumeration enumerateIssmensal() 

    /**
     * Method enumerateMotivo
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateMotivo()
    {
        return _motivoList.elements();
    } //-- java.util.Enumeration enumerateMotivo() 

    /**
     * Method enumerateTributavel
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateTributavel()
    {
        return _tributavelList.elements();
    } //-- java.util.Enumeration enumerateTributavel() 

    /**
     * Returns the value of field 'contaContabil'.
     * 
     * @return long
     * @return the value of field 'contaContabil'.
     */
    public long getContaContabil()
    {
        return this._contaContabil;
    } //-- long getContaContabil() 

    /**
     * Method getIss
     * 
     * 
     * 
     * @param index
     * @return Iss
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Iss getIss(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _issList.size())) {
            throw new IndexOutOfBoundsException("getIss: Index value '"+index+"' not in range [0.."+(_issList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Iss) _issList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Iss getIss(int) 

    /**
     * Method getIss
     * 
     * 
     * 
     * @return Iss
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Iss[] getIss()
    {
        int size = _issList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Iss[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Iss[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Iss) _issList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Iss[] getIss() 

    /**
     * Method getIssCount
     * 
     * 
     * 
     * @return int
     */
    public int getIssCount()
    {
        return _issList.size();
    } //-- int getIssCount() 

    /**
     * Method getIssmensal
     * 
     * 
     * 
     * @param index
     * @return Issmensal
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Issmensal getIssmensal(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _issmensalList.size())) {
            throw new IndexOutOfBoundsException("getIssmensal: Index value '"+index+"' not in range [0.."+(_issmensalList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Issmensal) _issmensalList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Issmensal getIssmensal(int) 

    /**
     * Method getIssmensal
     * 
     * 
     * 
     * @return Issmensal
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Issmensal[] getIssmensal()
    {
        int size = _issmensalList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Issmensal[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Issmensal[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Issmensal) _issmensalList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Issmensal[] getIssmensal() 

    /**
     * Method getIssmensalCount
     * 
     * 
     * 
     * @return int
     */
    public int getIssmensalCount()
    {
        return _issmensalList.size();
    } //-- int getIssmensalCount() 

    /**
     * Method getMotivo
     * 
     * 
     * 
     * @param index
     * @return Motivo
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Motivo getMotivo(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _motivoList.size())) {
            throw new IndexOutOfBoundsException("getMotivo: Index value '"+index+"' not in range [0.."+(_motivoList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Motivo) _motivoList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Motivo getMotivo(int) 

    /**
     * Method getMotivo
     * 
     * 
     * 
     * @return Motivo
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Motivo[] getMotivo()
    {
        int size = _motivoList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Motivo[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Motivo[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Motivo) _motivoList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Motivo[] getMotivo() 

    /**
     * Method getMotivoCount
     * 
     * 
     * 
     * @return int
     */
    public int getMotivoCount()
    {
        return _motivoList.size();
    } //-- int getMotivoCount() 

    /**
     * Returns the value of field 'percentualAliquotaConta'.
     * 
     * @return double
     * @return the value of field 'percentualAliquotaConta'.
     */
    public double getPercentualAliquotaConta()
    {
        return this._percentualAliquotaConta;
    } //-- double getPercentualAliquotaConta() 

    /**
     * Method getTributavel
     * 
     * 
     * 
     * @param index
     * @return Tributavel
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Tributavel getTributavel(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _tributavelList.size())) {
            throw new IndexOutOfBoundsException("getTributavel: Index value '"+index+"' not in range [0.."+(_tributavelList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Tributavel) _tributavelList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Tributavel getTributavel(int) 

    /**
     * Method getTributavel
     * 
     * 
     * 
     * @return Tributavel
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Tributavel[] getTributavel()
    {
        int size = _tributavelList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Tributavel[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Tributavel[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Tributavel) _tributavelList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Tributavel[] getTributavel() 

    /**
     * Method getTributavelCount
     * 
     * 
     * 
     * @return int
     */
    public int getTributavelCount()
    {
        return _tributavelList.size();
    } //-- int getTributavelCount() 

    /**
     * Method hasContaContabil
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasContaContabil()
    {
        return this._has_contaContabil;
    } //-- boolean hasContaContabil() 

    /**
     * Method hasPercentualAliquotaConta
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasPercentualAliquotaConta()
    {
        return this._has_percentualAliquotaConta;
    } //-- boolean hasPercentualAliquotaConta() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Method removeAllIss
     * 
     */
    public void removeAllIss()
    {
        _issList.removeAllElements();
    } //-- void removeAllIss() 

    /**
     * Method removeAllIssmensal
     * 
     */
    public void removeAllIssmensal()
    {
        _issmensalList.removeAllElements();
    } //-- void removeAllIssmensal() 

    /**
     * Method removeAllMotivo
     * 
     */
    public void removeAllMotivo()
    {
        _motivoList.removeAllElements();
    } //-- void removeAllMotivo() 

    /**
     * Method removeAllTributavel
     * 
     */
    public void removeAllTributavel()
    {
        _tributavelList.removeAllElements();
    } //-- void removeAllTributavel() 

    /**
     * Method removeIss
     * 
     * 
     * 
     * @param index
     * @return Iss
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Iss removeIss(int index)
    {
        java.lang.Object obj = _issList.elementAt(index);
        _issList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Iss) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Iss removeIss(int) 

    /**
     * Method removeIssmensal
     * 
     * 
     * 
     * @param index
     * @return Issmensal
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Issmensal removeIssmensal(int index)
    {
        java.lang.Object obj = _issmensalList.elementAt(index);
        _issmensalList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Issmensal) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Issmensal removeIssmensal(int) 

    /**
     * Method removeMotivo
     * 
     * 
     * 
     * @param index
     * @return Motivo
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Motivo removeMotivo(int index)
    {
        java.lang.Object obj = _motivoList.elementAt(index);
        _motivoList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Motivo) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Motivo removeMotivo(int) 

    /**
     * Method removeTributavel
     * 
     * 
     * 
     * @param index
     * @return Tributavel
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Tributavel removeTributavel(int index)
    {
        java.lang.Object obj = _tributavelList.elementAt(index);
        _tributavelList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Tributavel) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Tributavel removeTributavel(int) 

    /**
     * Sets the value of field 'contaContabil'.
     * 
     * @param contaContabil the value of field 'contaContabil'.
     */
    public void setContaContabil(long contaContabil)
    {
        this._contaContabil = contaContabil;
        this._has_contaContabil = true;
    } //-- void setContaContabil(long) 

    /**
     * Method setIss
     * 
     * 
     * 
     * @param index
     * @param vIss
     */
    public void setIss(int index, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Iss vIss)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _issList.size())) {
            throw new IndexOutOfBoundsException("setIss: Index value '"+index+"' not in range [0.." + (_issList.size() - 1) + "]");
        }
        _issList.setElementAt(vIss, index);
    } //-- void setIss(int, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Iss) 

    /**
     * Method setIss
     * 
     * 
     * 
     * @param issArray
     */
    public void setIss(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Iss[] issArray)
    {
        //-- copy array
        _issList.removeAllElements();
        for (int i = 0; i < issArray.length; i++) {
            _issList.addElement(issArray[i]);
        }
    } //-- void setIss(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Iss) 

    /**
     * Method setIssmensal
     * 
     * 
     * 
     * @param index
     * @param vIssmensal
     */
    public void setIssmensal(int index, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Issmensal vIssmensal)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _issmensalList.size())) {
            throw new IndexOutOfBoundsException("setIssmensal: Index value '"+index+"' not in range [0.." + (_issmensalList.size() - 1) + "]");
        }
        _issmensalList.setElementAt(vIssmensal, index);
    } //-- void setIssmensal(int, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Issmensal) 

    /**
     * Method setIssmensal
     * 
     * 
     * 
     * @param issmensalArray
     */
    public void setIssmensal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Issmensal[] issmensalArray)
    {
        //-- copy array
        _issmensalList.removeAllElements();
        for (int i = 0; i < issmensalArray.length; i++) {
            _issmensalList.addElement(issmensalArray[i]);
        }
    } //-- void setIssmensal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Issmensal) 

    /**
     * Method setMotivo
     * 
     * 
     * 
     * @param index
     * @param vMotivo
     */
    public void setMotivo(int index, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Motivo vMotivo)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _motivoList.size())) {
            throw new IndexOutOfBoundsException("setMotivo: Index value '"+index+"' not in range [0.." + (_motivoList.size() - 1) + "]");
        }
        _motivoList.setElementAt(vMotivo, index);
    } //-- void setMotivo(int, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Motivo) 

    /**
     * Method setMotivo
     * 
     * 
     * 
     * @param motivoArray
     */
    public void setMotivo(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Motivo[] motivoArray)
    {
        //-- copy array
        _motivoList.removeAllElements();
        for (int i = 0; i < motivoArray.length; i++) {
            _motivoList.addElement(motivoArray[i]);
        }
    } //-- void setMotivo(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Motivo) 

    /**
     * Sets the value of field 'percentualAliquotaConta'.
     * 
     * @param percentualAliquotaConta the value of field
     * 'percentualAliquotaConta'.
     */
    public void setPercentualAliquotaConta(double percentualAliquotaConta)
    {
        this._percentualAliquotaConta = percentualAliquotaConta;
        this._has_percentualAliquotaConta = true;
    } //-- void setPercentualAliquotaConta(double) 

    /**
     * Method setTributavel
     * 
     * 
     * 
     * @param index
     * @param vTributavel
     */
    public void setTributavel(int index, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Tributavel vTributavel)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _tributavelList.size())) {
            throw new IndexOutOfBoundsException("setTributavel: Index value '"+index+"' not in range [0.." + (_tributavelList.size() - 1) + "]");
        }
        _tributavelList.setElementAt(vTributavel, index);
    } //-- void setTributavel(int, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Tributavel) 

    /**
     * Method setTributavel
     * 
     * 
     * 
     * @param tributavelArray
     */
    public void setTributavel(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Tributavel[] tributavelArray)
    {
        //-- copy array
        _tributavelList.removeAllElements();
        for (int i = 0; i < tributavelArray.length; i++) {
            _tributavelList.addElement(tributavelArray[i]);
        }
    } //-- void setTributavel(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Tributavel) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Ocorrencias unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
