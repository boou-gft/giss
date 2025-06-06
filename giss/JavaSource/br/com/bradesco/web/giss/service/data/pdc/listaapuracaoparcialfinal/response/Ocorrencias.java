/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response;

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
     * Field _contaContabilTributavel
     */
    private java.lang.String _contaContabilTributavel;

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
     * Field _valorMovimentoSinal
     */
    private java.lang.String _valorMovimentoSinal;

    /**
     * Field _valorMovimento
     */
    private double _valorMovimento = 0;

    /**
     * keeps track of state for field: _valorMovimento
     */
    private boolean _has_valorMovimento;

    /**
     * Field _valorTributarioSinal
     */
    private java.lang.String _valorTributarioSinal;

    /**
     * Field _valorTributario
     */
    private double _valorTributario = 0;

    /**
     * keeps track of state for field: _valorTributario
     */
    private boolean _has_valorTributario;

    /**
     * Field _aliquotaConta
     */
    private double _aliquotaConta = 0;

    /**
     * keeps track of state for field: _aliquotaConta
     */
    private boolean _has_aliquotaConta;

    /**
     * Field _valorIssSinal
     */
    private java.lang.String _valorIssSinal;

    /**
     * Field _valorIss
     */
    private double _valorIss = 0;

    /**
     * keeps track of state for field: _valorIss
     */
    private boolean _has_valorIss;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.Ocorrencias()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteAliquotaConta
     * 
     */
    public void deleteAliquotaConta()
    {
        this._has_aliquotaConta= false;
    } //-- void deleteAliquotaConta() 

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
     * Method deleteValorIss
     * 
     */
    public void deleteValorIss()
    {
        this._has_valorIss= false;
    } //-- void deleteValorIss() 

    /**
     * Method deleteValorMovimento
     * 
     */
    public void deleteValorMovimento()
    {
        this._has_valorMovimento= false;
    } //-- void deleteValorMovimento() 

    /**
     * Method deleteValorTributario
     * 
     */
    public void deleteValorTributario()
    {
        this._has_valorTributario= false;
    } //-- void deleteValorTributario() 

    /**
     * Returns the value of field 'aliquotaConta'.
     * 
     * @return double
     * @return the value of field 'aliquotaConta'.
     */
    public double getAliquotaConta()
    {
        return this._aliquotaConta;
    } //-- double getAliquotaConta() 

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
     * Returns the value of field 'contaContabilTributavel'.
     * 
     * @return String
     * @return the value of field 'contaContabilTributavel'.
     */
    public java.lang.String getContaContabilTributavel()
    {
        return this._contaContabilTributavel;
    } //-- java.lang.String getContaContabilTributavel() 

    /**
     * Returns the value of field 'valorIss'.
     * 
     * @return double
     * @return the value of field 'valorIss'.
     */
    public double getValorIss()
    {
        return this._valorIss;
    } //-- double getValorIss() 

    /**
     * Returns the value of field 'valorIssSinal'.
     * 
     * @return String
     * @return the value of field 'valorIssSinal'.
     */
    public java.lang.String getValorIssSinal()
    {
        return this._valorIssSinal;
    } //-- java.lang.String getValorIssSinal() 

    /**
     * Returns the value of field 'valorMovimento'.
     * 
     * @return double
     * @return the value of field 'valorMovimento'.
     */
    public double getValorMovimento()
    {
        return this._valorMovimento;
    } //-- double getValorMovimento() 

    /**
     * Returns the value of field 'valorMovimentoSinal'.
     * 
     * @return String
     * @return the value of field 'valorMovimentoSinal'.
     */
    public java.lang.String getValorMovimentoSinal()
    {
        return this._valorMovimentoSinal;
    } //-- java.lang.String getValorMovimentoSinal() 

    /**
     * Returns the value of field 'valorTributario'.
     * 
     * @return double
     * @return the value of field 'valorTributario'.
     */
    public double getValorTributario()
    {
        return this._valorTributario;
    } //-- double getValorTributario() 

    /**
     * Returns the value of field 'valorTributarioSinal'.
     * 
     * @return String
     * @return the value of field 'valorTributarioSinal'.
     */
    public java.lang.String getValorTributarioSinal()
    {
        return this._valorTributarioSinal;
    } //-- java.lang.String getValorTributarioSinal() 

    /**
     * Method hasAliquotaConta
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAliquotaConta()
    {
        return this._has_aliquotaConta;
    } //-- boolean hasAliquotaConta() 

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
     * Method hasValorIss
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorIss()
    {
        return this._has_valorIss;
    } //-- boolean hasValorIss() 

    /**
     * Method hasValorMovimento
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorMovimento()
    {
        return this._has_valorMovimento;
    } //-- boolean hasValorMovimento() 

    /**
     * Method hasValorTributario
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorTributario()
    {
        return this._has_valorTributario;
    } //-- boolean hasValorTributario() 

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
     * Sets the value of field 'aliquotaConta'.
     * 
     * @param aliquotaConta the value of field 'aliquotaConta'.
     */
    public void setAliquotaConta(double aliquotaConta)
    {
        this._aliquotaConta = aliquotaConta;
        this._has_aliquotaConta = true;
    } //-- void setAliquotaConta(double) 

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
     * Sets the value of field 'contaContabilTributavel'.
     * 
     * @param contaContabilTributavel the value of field
     * 'contaContabilTributavel'.
     */
    public void setContaContabilTributavel(java.lang.String contaContabilTributavel)
    {
        this._contaContabilTributavel = contaContabilTributavel;
    } //-- void setContaContabilTributavel(java.lang.String) 

    /**
     * Sets the value of field 'valorIss'.
     * 
     * @param valorIss the value of field 'valorIss'.
     */
    public void setValorIss(double valorIss)
    {
        this._valorIss = valorIss;
        this._has_valorIss = true;
    } //-- void setValorIss(double) 

    /**
     * Sets the value of field 'valorIssSinal'.
     * 
     * @param valorIssSinal the value of field 'valorIssSinal'.
     */
    public void setValorIssSinal(java.lang.String valorIssSinal)
    {
        this._valorIssSinal = valorIssSinal;
    } //-- void setValorIssSinal(java.lang.String) 

    /**
     * Sets the value of field 'valorMovimento'.
     * 
     * @param valorMovimento the value of field 'valorMovimento'.
     */
    public void setValorMovimento(double valorMovimento)
    {
        this._valorMovimento = valorMovimento;
        this._has_valorMovimento = true;
    } //-- void setValorMovimento(double) 

    /**
     * Sets the value of field 'valorMovimentoSinal'.
     * 
     * @param valorMovimentoSinal the value of field
     * 'valorMovimentoSinal'.
     */
    public void setValorMovimentoSinal(java.lang.String valorMovimentoSinal)
    {
        this._valorMovimentoSinal = valorMovimentoSinal;
    } //-- void setValorMovimentoSinal(java.lang.String) 

    /**
     * Sets the value of field 'valorTributario'.
     * 
     * @param valorTributario the value of field 'valorTributario'.
     */
    public void setValorTributario(double valorTributario)
    {
        this._valorTributario = valorTributario;
        this._has_valorTributario = true;
    } //-- void setValorTributario(double) 

    /**
     * Sets the value of field 'valorTributarioSinal'.
     * 
     * @param valorTributarioSinal the value of field
     * 'valorTributarioSinal'.
     */
    public void setValorTributarioSinal(java.lang.String valorTributarioSinal)
    {
        this._valorTributarioSinal = valorTributarioSinal;
    } //-- void setValorTributarioSinal(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.response.Ocorrencias unmarshal(java.io.Reader) 

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
