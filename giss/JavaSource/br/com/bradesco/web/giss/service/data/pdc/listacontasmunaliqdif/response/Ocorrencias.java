/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listacontasmunaliqdif.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class Ocorrencias.
 * 
 * @version $Revision$ $Date$
 */
public class Ocorrencias implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoConta
     */
    private java.lang.String _codigoConta;

    /**
     * Field _codigoGrupo
     */
    private int _codigoGrupo = 0;

    /**
     * keeps track of state for field: _codigoGrupo
     */
    private boolean _has_codigoGrupo;

    /**
     * Field _codigoSubgrupo
     */
    private int _codigoSubgrupo = 0;

    /**
     * keeps track of state for field: _codigoSubgrupo
     */
    private boolean _has_codigoSubgrupo;

    /**
     * Field _numeroConta
     */
    private int _numeroConta = 0;

    /**
     * keeps track of state for field: _numeroConta
     */
    private boolean _has_numeroConta;

    /**
     * Field _digitoConta
     */
    private java.lang.String _digitoConta;

    /**
     * Field _descricaoRazao
     */
    private java.lang.String _descricaoRazao;

    /**
     * Field _itemLei
     */
    private int _itemLei = 0;

    /**
     * keeps track of state for field: _itemLei
     */
    private boolean _has_itemLei;

    /**
     * Field _aliquotaPadrao
     */
    private double _aliquotaPadrao = 0;

    /**
     * keeps track of state for field: _aliquotaPadrao
     */
    private boolean _has_aliquotaPadrao;

    /**
     * Field _aliquotaDiferenciada
     */
    private double _aliquotaDiferenciada = 0;

    /**
     * keeps track of state for field: _aliquotaDiferenciada
     */
    private boolean _has_aliquotaDiferenciada;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listacontasmunaliqdif.response.Ocorrencias()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteAliquotaDiferenciada
     * 
     */
    public void deleteAliquotaDiferenciada()
    {
        this._has_aliquotaDiferenciada= false;
    } //-- void deleteAliquotaDiferenciada() 

    /**
     * Method deleteAliquotaPadrao
     * 
     */
    public void deleteAliquotaPadrao()
    {
        this._has_aliquotaPadrao= false;
    } //-- void deleteAliquotaPadrao() 

    /**
     * Method deleteCodigoGrupo
     * 
     */
    public void deleteCodigoGrupo()
    {
        this._has_codigoGrupo= false;
    } //-- void deleteCodigoGrupo() 

    /**
     * Method deleteCodigoSubgrupo
     * 
     */
    public void deleteCodigoSubgrupo()
    {
        this._has_codigoSubgrupo= false;
    } //-- void deleteCodigoSubgrupo() 

    /**
     * Method deleteItemLei
     * 
     */
    public void deleteItemLei()
    {
        this._has_itemLei= false;
    } //-- void deleteItemLei() 

    /**
     * Method deleteNumeroConta
     * 
     */
    public void deleteNumeroConta()
    {
        this._has_numeroConta= false;
    } //-- void deleteNumeroConta() 

    /**
     * Returns the value of field 'aliquotaDiferenciada'.
     * 
     * @return double
     * @return the value of field 'aliquotaDiferenciada'.
     */
    public double getAliquotaDiferenciada()
    {
        return this._aliquotaDiferenciada;
    } //-- double getAliquotaDiferenciada() 

    /**
     * Returns the value of field 'aliquotaPadrao'.
     * 
     * @return double
     * @return the value of field 'aliquotaPadrao'.
     */
    public double getAliquotaPadrao()
    {
        return this._aliquotaPadrao;
    } //-- double getAliquotaPadrao() 

    /**
     * Returns the value of field 'codigoConta'.
     * 
     * @return String
     * @return the value of field 'codigoConta'.
     */
    public java.lang.String getCodigoConta()
    {
        return this._codigoConta;
    } //-- java.lang.String getCodigoConta() 

    /**
     * Returns the value of field 'codigoGrupo'.
     * 
     * @return int
     * @return the value of field 'codigoGrupo'.
     */
    public int getCodigoGrupo()
    {
        return this._codigoGrupo;
    } //-- int getCodigoGrupo() 

    /**
     * Returns the value of field 'codigoSubgrupo'.
     * 
     * @return int
     * @return the value of field 'codigoSubgrupo'.
     */
    public int getCodigoSubgrupo()
    {
        return this._codigoSubgrupo;
    } //-- int getCodigoSubgrupo() 

    /**
     * Returns the value of field 'descricaoRazao'.
     * 
     * @return String
     * @return the value of field 'descricaoRazao'.
     */
    public java.lang.String getDescricaoRazao()
    {
        return this._descricaoRazao;
    } //-- java.lang.String getDescricaoRazao() 

    /**
     * Returns the value of field 'digitoConta'.
     * 
     * @return String
     * @return the value of field 'digitoConta'.
     */
    public java.lang.String getDigitoConta()
    {
        return this._digitoConta;
    } //-- java.lang.String getDigitoConta() 

    /**
     * Returns the value of field 'itemLei'.
     * 
     * @return int
     * @return the value of field 'itemLei'.
     */
    public int getItemLei()
    {
        return this._itemLei;
    } //-- int getItemLei() 

    /**
     * Returns the value of field 'numeroConta'.
     * 
     * @return int
     * @return the value of field 'numeroConta'.
     */
    public int getNumeroConta()
    {
        return this._numeroConta;
    } //-- int getNumeroConta() 

    /**
     * Method hasAliquotaDiferenciada
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAliquotaDiferenciada()
    {
        return this._has_aliquotaDiferenciada;
    } //-- boolean hasAliquotaDiferenciada() 

    /**
     * Method hasAliquotaPadrao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAliquotaPadrao()
    {
        return this._has_aliquotaPadrao;
    } //-- boolean hasAliquotaPadrao() 

    /**
     * Method hasCodigoGrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoGrupo()
    {
        return this._has_codigoGrupo;
    } //-- boolean hasCodigoGrupo() 

    /**
     * Method hasCodigoSubgrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoSubgrupo()
    {
        return this._has_codigoSubgrupo;
    } //-- boolean hasCodigoSubgrupo() 

    /**
     * Method hasItemLei
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasItemLei()
    {
        return this._has_itemLei;
    } //-- boolean hasItemLei() 

    /**
     * Method hasNumeroConta
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroConta()
    {
        return this._has_numeroConta;
    } //-- boolean hasNumeroConta() 

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
     * Sets the value of field 'aliquotaDiferenciada'.
     * 
     * @param aliquotaDiferenciada the value of field
     * 'aliquotaDiferenciada'.
     */
    public void setAliquotaDiferenciada(double aliquotaDiferenciada)
    {
        this._aliquotaDiferenciada = aliquotaDiferenciada;
        this._has_aliquotaDiferenciada = true;
    } //-- void setAliquotaDiferenciada(double) 

    /**
     * Sets the value of field 'aliquotaPadrao'.
     * 
     * @param aliquotaPadrao the value of field 'aliquotaPadrao'.
     */
    public void setAliquotaPadrao(double aliquotaPadrao)
    {
        this._aliquotaPadrao = aliquotaPadrao;
        this._has_aliquotaPadrao = true;
    } //-- void setAliquotaPadrao(double) 

    /**
     * Sets the value of field 'codigoConta'.
     * 
     * @param codigoConta the value of field 'codigoConta'.
     */
    public void setCodigoConta(java.lang.String codigoConta)
    {
        this._codigoConta = codigoConta;
    } //-- void setCodigoConta(java.lang.String) 

    /**
     * Sets the value of field 'codigoGrupo'.
     * 
     * @param codigoGrupo the value of field 'codigoGrupo'.
     */
    public void setCodigoGrupo(int codigoGrupo)
    {
        this._codigoGrupo = codigoGrupo;
        this._has_codigoGrupo = true;
    } //-- void setCodigoGrupo(int) 

    /**
     * Sets the value of field 'codigoSubgrupo'.
     * 
     * @param codigoSubgrupo the value of field 'codigoSubgrupo'.
     */
    public void setCodigoSubgrupo(int codigoSubgrupo)
    {
        this._codigoSubgrupo = codigoSubgrupo;
        this._has_codigoSubgrupo = true;
    } //-- void setCodigoSubgrupo(int) 

    /**
     * Sets the value of field 'descricaoRazao'.
     * 
     * @param descricaoRazao the value of field 'descricaoRazao'.
     */
    public void setDescricaoRazao(java.lang.String descricaoRazao)
    {
        this._descricaoRazao = descricaoRazao;
    } //-- void setDescricaoRazao(java.lang.String) 

    /**
     * Sets the value of field 'digitoConta'.
     * 
     * @param digitoConta the value of field 'digitoConta'.
     */
    public void setDigitoConta(java.lang.String digitoConta)
    {
        this._digitoConta = digitoConta;
    } //-- void setDigitoConta(java.lang.String) 

    /**
     * Sets the value of field 'itemLei'.
     * 
     * @param itemLei the value of field 'itemLei'.
     */
    public void setItemLei(int itemLei)
    {
        this._itemLei = itemLei;
        this._has_itemLei = true;
    } //-- void setItemLei(int) 

    /**
     * Sets the value of field 'numeroConta'.
     * 
     * @param numeroConta the value of field 'numeroConta'.
     */
    public void setNumeroConta(int numeroConta)
    {
        this._numeroConta = numeroConta;
        this._has_numeroConta = true;
    } //-- void setNumeroConta(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listacontasmunaliqdif.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listacontasmunaliqdif.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listacontasmunaliqdif.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listacontasmunaliqdif.response.Ocorrencias unmarshal(java.io.Reader) 

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
