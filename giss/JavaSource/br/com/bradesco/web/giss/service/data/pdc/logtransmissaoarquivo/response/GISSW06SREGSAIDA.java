/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.response;

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
 * Class GISSW06SREGSAIDA.
 * 
 * @version $Revision$ $Date$
 */
public class GISSW06SREGSAIDA implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _sNctrlRemssDepdc
     */
    private long _sNctrlRemssDepdc = 0;

    /**
     * keeps track of state for field: _sNctrlRemssDepdc
     */
    private boolean _has_sNctrlRemssDepdc;

    /**
     * Field _sCmunBacen
     */
    private long _sCmunBacen = 0;

    /**
     * keeps track of state for field: _sCmunBacen
     */
    private boolean _has_sCmunBacen;

    /**
     * Field _sRmunBacen
     */
    private java.lang.String _sRmunBacen;

    /**
     * Field _sCpssoaJurid
     */
    private long _sCpssoaJurid = 0;

    /**
     * keeps track of state for field: _sCpssoaJurid
     */
    private boolean _has_sCpssoaJurid;

    /**
     * Field _sNseqUndOrgnz
     */
    private int _sNseqUndOrgnz = 0;

    /**
     * keeps track of state for field: _sNseqUndOrgnz
     */
    private boolean _has_sNseqUndOrgnz;

    /**
     * Field _sRseqUndOrgnz
     */
    private java.lang.String _sRseqUndOrgnz;

    /**
     * Field _sCtpoArqPreft
     */
    private int _sCtpoArqPreft = 0;

    /**
     * keeps track of state for field: _sCtpoArqPreft
     */
    private boolean _has_sCtpoArqPreft;

    /**
     * Field _sRtpoArqPreft
     */
    private java.lang.String _sRtpoArqPreft;

    /**
     * Field _sIarqRemssPreft
     */
    private java.lang.String _sIarqRemssPreft;

    /**
     * Field _sCsitTrnsmPreft
     */
    private int _sCsitTrnsmPreft = 0;

    /**
     * keeps track of state for field: _sCsitTrnsmPreft
     */
    private boolean _has_sCsitTrnsmPreft;

    /**
     * Field _sRsitTrnsmPreft
     */
    private java.lang.String _sRsitTrnsmPreft;

    /**
     * Field _sDataRemessa
     */
    private java.lang.String _sDataRemessa;

    /**
     * Field _sHoraRemessa
     */
    private java.lang.String _sHoraRemessa;

    /**
     * Field _sRmsgemRetorPreft
     */
    private java.lang.String _sRmsgemRetorPreft;

    /**
     * Field _sCusuarIncl
     */
    private java.lang.String _sCusuarIncl;


      //----------------/
     //- Constructors -/
    //----------------/

    public GISSW06SREGSAIDA() 
     {
        super();
    } //-- br.com.bradesco.web.service.data.pdc.logtransmissaoarquivo.response.GISSW06SREGSAIDA()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteSCmunBacen
     * 
     */
    public void deleteSCmunBacen()
    {
        this._has_sCmunBacen= false;
    } //-- void deleteSCmunBacen() 

    /**
     * Method deleteSCpssoaJurid
     * 
     */
    public void deleteSCpssoaJurid()
    {
        this._has_sCpssoaJurid= false;
    } //-- void deleteSCpssoaJurid() 

    /**
     * Method deleteSCsitTrnsmPreft
     * 
     */
    public void deleteSCsitTrnsmPreft()
    {
        this._has_sCsitTrnsmPreft= false;
    } //-- void deleteSCsitTrnsmPreft() 

    /**
     * Method deleteSCtpoArqPreft
     * 
     */
    public void deleteSCtpoArqPreft()
    {
        this._has_sCtpoArqPreft= false;
    } //-- void deleteSCtpoArqPreft() 

    /**
     * Method deleteSNctrlRemssDepdc
     * 
     */
    public void deleteSNctrlRemssDepdc()
    {
        this._has_sNctrlRemssDepdc= false;
    } //-- void deleteSNctrlRemssDepdc() 

    /**
     * Method deleteSNseqUndOrgnz
     * 
     */
    public void deleteSNseqUndOrgnz()
    {
        this._has_sNseqUndOrgnz= false;
    } //-- void deleteSNseqUndOrgnz() 

    /**
     * Returns the value of field 'sCmunBacen'.
     * 
     * @return long
     * @return the value of field 'sCmunBacen'.
     */
    public long getSCmunBacen()
    {
        return this._sCmunBacen;
    } //-- long getSCmunBacen() 

    /**
     * Returns the value of field 'sCpssoaJurid'.
     * 
     * @return long
     * @return the value of field 'sCpssoaJurid'.
     */
    public long getSCpssoaJurid()
    {
        return this._sCpssoaJurid;
    } //-- long getSCpssoaJurid() 

    /**
     * Returns the value of field 'sCsitTrnsmPreft'.
     * 
     * @return int
     * @return the value of field 'sCsitTrnsmPreft'.
     */
    public int getSCsitTrnsmPreft()
    {
        return this._sCsitTrnsmPreft;
    } //-- int getSCsitTrnsmPreft() 

    /**
     * Returns the value of field 'sCtpoArqPreft'.
     * 
     * @return int
     * @return the value of field 'sCtpoArqPreft'.
     */
    public int getSCtpoArqPreft()
    {
        return this._sCtpoArqPreft;
    } //-- int getSCtpoArqPreft() 

    /**
     * Returns the value of field 'sCusuarIncl'.
     * 
     * @return String
     * @return the value of field 'sCusuarIncl'.
     */
    public java.lang.String getSCusuarIncl()
    {
        return this._sCusuarIncl;
    } //-- java.lang.String getSCusuarIncl() 

    /**
     * Returns the value of field 'sDataRemessa'.
     * 
     * @return String
     * @return the value of field 'sDataRemessa'.
     */
    public java.lang.String getSDataRemessa()
    {
        return this._sDataRemessa;
    } //-- java.lang.String getSDataRemessa() 

    /**
     * Returns the value of field 'sHoraRemessa'.
     * 
     * @return String
     * @return the value of field 'sHoraRemessa'.
     */
    public java.lang.String getSHoraRemessa()
    {
        return this._sHoraRemessa;
    } //-- java.lang.String getSHoraRemessa() 

    /**
     * Returns the value of field 'sIarqRemssPreft'.
     * 
     * @return String
     * @return the value of field 'sIarqRemssPreft'.
     */
    public java.lang.String getSIarqRemssPreft()
    {
        return this._sIarqRemssPreft;
    } //-- java.lang.String getSIarqRemssPreft() 

    /**
     * Returns the value of field 'sNctrlRemssDepdc'.
     * 
     * @return long
     * @return the value of field 'sNctrlRemssDepdc'.
     */
    public long getSNctrlRemssDepdc()
    {
        return this._sNctrlRemssDepdc;
    } //-- long getSNctrlRemssDepdc() 

    /**
     * Returns the value of field 'sNseqUndOrgnz'.
     * 
     * @return int
     * @return the value of field 'sNseqUndOrgnz'.
     */
    public int getSNseqUndOrgnz()
    {
        return this._sNseqUndOrgnz;
    } //-- int getSNseqUndOrgnz() 

    /**
     * Returns the value of field 'sRmsgemRetorPreft'.
     * 
     * @return String
     * @return the value of field 'sRmsgemRetorPreft'.
     */
    public java.lang.String getSRmsgemRetorPreft()
    {
        return this._sRmsgemRetorPreft;
    } //-- java.lang.String getSRmsgemRetorPreft() 

    /**
     * Returns the value of field 'sRmunBacen'.
     * 
     * @return String
     * @return the value of field 'sRmunBacen'.
     */
    public java.lang.String getSRmunBacen()
    {
        return this._sRmunBacen;
    } //-- java.lang.String getSRmunBacen() 

    /**
     * Returns the value of field 'sRseqUndOrgnz'.
     * 
     * @return String
     * @return the value of field 'sRseqUndOrgnz'.
     */
    public java.lang.String getSRseqUndOrgnz()
    {
        return this._sRseqUndOrgnz;
    } //-- java.lang.String getSRseqUndOrgnz() 

    /**
     * Returns the value of field 'sRsitTrnsmPreft'.
     * 
     * @return String
     * @return the value of field 'sRsitTrnsmPreft'.
     */
    public java.lang.String getSRsitTrnsmPreft()
    {
        return this._sRsitTrnsmPreft;
    } //-- java.lang.String getSRsitTrnsmPreft() 

    /**
     * Returns the value of field 'sRtpoArqPreft'.
     * 
     * @return String
     * @return the value of field 'sRtpoArqPreft'.
     */
    public java.lang.String getSRtpoArqPreft()
    {
        return this._sRtpoArqPreft;
    } //-- java.lang.String getSRtpoArqPreft() 

    /**
     * Method hasSCmunBacen
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSCmunBacen()
    {
        return this._has_sCmunBacen;
    } //-- boolean hasSCmunBacen() 

    /**
     * Method hasSCpssoaJurid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSCpssoaJurid()
    {
        return this._has_sCpssoaJurid;
    } //-- boolean hasSCpssoaJurid() 

    /**
     * Method hasSCsitTrnsmPreft
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSCsitTrnsmPreft()
    {
        return this._has_sCsitTrnsmPreft;
    } //-- boolean hasSCsitTrnsmPreft() 

    /**
     * Method hasSCtpoArqPreft
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSCtpoArqPreft()
    {
        return this._has_sCtpoArqPreft;
    } //-- boolean hasSCtpoArqPreft() 

    /**
     * Method hasSNctrlRemssDepdc
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSNctrlRemssDepdc()
    {
        return this._has_sNctrlRemssDepdc;
    } //-- boolean hasSNctrlRemssDepdc() 

    /**
     * Method hasSNseqUndOrgnz
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSNseqUndOrgnz()
    {
        return this._has_sNseqUndOrgnz;
    } //-- boolean hasSNseqUndOrgnz() 

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
     * Sets the value of field 'sCmunBacen'.
     * 
     * @param sCmunBacen the value of field 'sCmunBacen'.
     */
    public void setSCmunBacen(long sCmunBacen)
    {
        this._sCmunBacen = sCmunBacen;
        this._has_sCmunBacen = true;
    } //-- void setSCmunBacen(long) 

    /**
     * Sets the value of field 'sCpssoaJurid'.
     * 
     * @param sCpssoaJurid the value of field 'sCpssoaJurid'.
     */
    public void setSCpssoaJurid(long sCpssoaJurid)
    {
        this._sCpssoaJurid = sCpssoaJurid;
        this._has_sCpssoaJurid = true;
    } //-- void setSCpssoaJurid(long) 

    /**
     * Sets the value of field 'sCsitTrnsmPreft'.
     * 
     * @param sCsitTrnsmPreft the value of field 'sCsitTrnsmPreft'.
     */
    public void setSCsitTrnsmPreft(int sCsitTrnsmPreft)
    {
        this._sCsitTrnsmPreft = sCsitTrnsmPreft;
        this._has_sCsitTrnsmPreft = true;
    } //-- void setSCsitTrnsmPreft(int) 

    /**
     * Sets the value of field 'sCtpoArqPreft'.
     * 
     * @param sCtpoArqPreft the value of field 'sCtpoArqPreft'.
     */
    public void setSCtpoArqPreft(int sCtpoArqPreft)
    {
        this._sCtpoArqPreft = sCtpoArqPreft;
        this._has_sCtpoArqPreft = true;
    } //-- void setSCtpoArqPreft(int) 

    /**
     * Sets the value of field 'sCusuarIncl'.
     * 
     * @param sCusuarIncl the value of field 'sCusuarIncl'.
     */
    public void setSCusuarIncl(java.lang.String sCusuarIncl)
    {
        this._sCusuarIncl = sCusuarIncl;
    } //-- void setSCusuarIncl(java.lang.String) 

    /**
     * Sets the value of field 'sDataRemessa'.
     * 
     * @param sDataRemessa the value of field 'sDataRemessa'.
     */
    public void setSDataRemessa(java.lang.String sDataRemessa)
    {
        this._sDataRemessa = sDataRemessa;
    } //-- void setSDataRemessa(java.lang.String) 

    /**
     * Sets the value of field 'sHoraRemessa'.
     * 
     * @param sHoraRemessa the value of field 'sHoraRemessa'.
     */
    public void setSHoraRemessa(java.lang.String sHoraRemessa)
    {
        this._sHoraRemessa = sHoraRemessa;
    } //-- void setSHoraRemessa(java.lang.String) 

    /**
     * Sets the value of field 'sIarqRemssPreft'.
     * 
     * @param sIarqRemssPreft the value of field 'sIarqRemssPreft'.
     */
    public void setSIarqRemssPreft(java.lang.String sIarqRemssPreft)
    {
        this._sIarqRemssPreft = sIarqRemssPreft;
    } //-- void setSIarqRemssPreft(java.lang.String) 

    /**
     * Sets the value of field 'sNctrlRemssDepdc'.
     * 
     * @param sNctrlRemssDepdc the value of field 'sNctrlRemssDepdc'
     */
    public void setSNctrlRemssDepdc(long sNctrlRemssDepdc)
    {
        this._sNctrlRemssDepdc = sNctrlRemssDepdc;
        this._has_sNctrlRemssDepdc = true;
    } //-- void setSNctrlRemssDepdc(long) 

    /**
     * Sets the value of field 'sNseqUndOrgnz'.
     * 
     * @param sNseqUndOrgnz the value of field 'sNseqUndOrgnz'.
     */
    public void setSNseqUndOrgnz(int sNseqUndOrgnz)
    {
        this._sNseqUndOrgnz = sNseqUndOrgnz;
        this._has_sNseqUndOrgnz = true;
    } //-- void setSNseqUndOrgnz(int) 

    /**
     * Sets the value of field 'sRmsgemRetorPreft'.
     * 
     * @param sRmsgemRetorPreft the value of field
     * 'sRmsgemRetorPreft'.
     */
    public void setSRmsgemRetorPreft(java.lang.String sRmsgemRetorPreft)
    {
        this._sRmsgemRetorPreft = sRmsgemRetorPreft;
    } //-- void setSRmsgemRetorPreft(java.lang.String) 

    /**
     * Sets the value of field 'sRmunBacen'.
     * 
     * @param sRmunBacen the value of field 'sRmunBacen'.
     */
    public void setSRmunBacen(java.lang.String sRmunBacen)
    {
        this._sRmunBacen = sRmunBacen;
    } //-- void setSRmunBacen(java.lang.String) 

    /**
     * Sets the value of field 'sRseqUndOrgnz'.
     * 
     * @param sRseqUndOrgnz the value of field 'sRseqUndOrgnz'.
     */
    public void setSRseqUndOrgnz(java.lang.String sRseqUndOrgnz)
    {
        this._sRseqUndOrgnz = sRseqUndOrgnz;
    } //-- void setSRseqUndOrgnz(java.lang.String) 

    /**
     * Sets the value of field 'sRsitTrnsmPreft'.
     * 
     * @param sRsitTrnsmPreft the value of field 'sRsitTrnsmPreft'.
     */
    public void setSRsitTrnsmPreft(java.lang.String sRsitTrnsmPreft)
    {
        this._sRsitTrnsmPreft = sRsitTrnsmPreft;
    } //-- void setSRsitTrnsmPreft(java.lang.String) 

    /**
     * Sets the value of field 'sRtpoArqPreft'.
     * 
     * @param sRtpoArqPreft the value of field 'sRtpoArqPreft'.
     */
    public void setSRtpoArqPreft(java.lang.String sRtpoArqPreft)
    {
        this._sRtpoArqPreft = sRtpoArqPreft;
    } //-- void setSRtpoArqPreft(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return GISSW06SREGSAIDA
     */
    public static br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.response.GISSW06SREGSAIDA unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.response.GISSW06SREGSAIDA) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.response.GISSW06SREGSAIDA.class, reader);
    } //-- br.com.bradesco.web.service.data.pdc.logtransmissaoarquivo.response.GISSW06SREGSAIDA unmarshal(java.io.Reader) 

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
